package org.fastsped.blocks.efdIcmsIpi.registers.blockC;

import org.fastsped.blocks.efdIcmsIpi.registers.blockC.helps.RegC190Data;
import org.fastsped.commons.EFDFormatter;
import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.model.data.Invoice;
import org.fastsped.model.data.InvoiceItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

public class CRegisters implements RegisterFactory {

    private final EfdIcmsIpi efdIcmsIpi;
    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    public CRegisters(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    @Override
    public String getRegisters(String[] registers) {
        List<Invoice> invoices = this.efdIcmsIpi.getInvoices();
        StringBuilder registersGenerated = new StringBuilder();

        registersGenerated.append(this.generateRegisterC001(invoices.isEmpty()));
        this.generateBlockInvoices(invoices, registersGenerated);
        registersGenerated.append(this.closeRegister("C", this.quantity));
        RegisterUtil.addQuantityRegs("C990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    private String generateRegisterC001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT : CONTENT;
        Register register = new RegisterC001(index);
        this.addLineInQuantity(register);
        RegisterUtil.addQuantityRegs("C001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private void generateBlockInvoices(List<Invoice> invoices, StringBuilder registersGenerated) {
        for(Invoice invoice : invoices) {
            int numItem = 0;
            registersGenerated.append(this.generateRegisterC100(invoice));
            Map<String, RegC190Data> totalizerCstCfopAlqIcms = new HashMap<>();
            for (InvoiceItem item : invoice.getInvoiceItems()) {
                String groupByTotalizer = item.getCstIcms() + item.getCfop() + item.getAlqIcms();
                RegC190Data data = this.createData(item);
                totalizerCstCfopAlqIcms.merge(groupByTotalizer, data, this.lambdaAddValueInTotalizer());
                registersGenerated.append(this.generateRegisterC170(item, numItem));
                numItem++;
            }

            for (Map.Entry<String, RegC190Data> valueRegC190 : totalizerCstCfopAlqIcms.entrySet()) {
                registersGenerated.append(this.generateRegisterC190(valueRegC190.getValue()));
            }
        }
    }

    private String generateRegisterC100(Invoice invoice) {
        Register register = new RegisterC100(invoice);
        this.addLineInQuantity(register);
        RegisterUtil.addQuantityRegs("C100", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegisterC170(InvoiceItem item, int numItem) {
        Register register = new RegisterC170(item, numItem);
        this.addLineInQuantity(register);
        RegisterUtil.addQuantityRegs("C170", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegisterC190(RegC190Data item) {
        Register register = new RegisterC190(item);
        this.addLineInQuantity(register);
        RegisterUtil.addQuantityRegs("C190", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private RegC190Data createData(InvoiceItem item) {
        RegC190Data data = new RegC190Data();
        data.setCstIcms(item.getCstIcms());
        data.setCfop(item.getCfop());
        data.setAliqIcms(EFDFormatter.bigDecimal(item.getAlqIcms()));
        data.setVlOpr(item.getVlItem());
        data.setVlBcIcms(item.getVlBcIcms());
        data.setVlIcms(item.getVlIcms());
        data.setVlBcIcmsSt(item.getVlBcIcmsSt());
        data.setVlIcmsSt(item.getVlIcmsSt());
        data.setVlIpi(item.getVlIpi());
        return data;
    }

    private BiFunction<RegC190Data, RegC190Data, RegC190Data> lambdaAddValueInTotalizer() {
        return (oldValue, newValue) -> {
            oldValue.setVlOpr(oldValue.getVlOpr().add(newValue.getVlOpr()));
            oldValue.setVlIcms(oldValue.getVlIcms().add(newValue.getVlIcms()));
            oldValue.setVlBcIcms(oldValue.getVlBcIcms().add(newValue.getVlBcIcmsSt()));
            oldValue.setVlIcmsSt(oldValue.getVlIcmsSt().add(newValue.getVlIcmsSt()));
            oldValue.setVlBcIcmsSt(oldValue.getVlBcIcmsSt().add(newValue.getVlBcIcmsSt()));
            oldValue.setVlRedBc(oldValue.getVlRedBc().add(newValue.getVlRedBc()));
            oldValue.setVlIpi(oldValue.getVlIpi().add(newValue.getVlIpi()));
            return oldValue;
        };
    }

    private void addLineInQuantity(Register register) {
        this.quantity += register.getQuantityLines();
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }
}
