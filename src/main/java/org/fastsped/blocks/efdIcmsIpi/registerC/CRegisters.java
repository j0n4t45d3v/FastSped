package org.fastsped.blocks.efdIcmsIpi.registerC;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.model.data.Invoice;
import org.fastsped.model.data.InvoiceItem;

import java.util.List;

import static org.fastsped.commons.Index.*;

public class CRegisters implements RegisterFactory {

    private final EfdIcmsIpi efdIcmsIpi;
    private int quantity;

    public CRegisters(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        List<Invoice> invoices = this.efdIcmsIpi.getInvoices();
        StringBuilder registersGenerated = new StringBuilder();

        registersGenerated.append(this.generateRegisterC001(invoices.isEmpty()));
        for(Invoice invoice : invoices) {
            int numItem = 0;
            registersGenerated.append(this.generateRegisterC100(invoice));
            for (InvoiceItem item : invoice.getInvoiceItems()) {
                registersGenerated.append(this.generateRegisterC170(item, numItem));
                numItem++;
            }
        }
        registersGenerated.append(this.closeRegister("C", this.quantity));
        return registersGenerated.toString();
    }

    private String generateRegisterC001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT : CONTENT;
        Register register = new RegisterC001(index);
        this.addLineInQuantity(register);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegisterC100(Invoice invoice) {
        Register register = new RegisterC100(invoice);
        this.addLineInQuantity(register);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegisterC170(InvoiceItem item, int numItem) {
        Register register = new RegisterC170(item, numItem);
        this.addLineInQuantity(register);
        return RegisterUtil.generateRegister(register);
    }

    private void addLineInQuantity(Register register) {
        this.quantity += register.getQuantityLines();
    }
}
