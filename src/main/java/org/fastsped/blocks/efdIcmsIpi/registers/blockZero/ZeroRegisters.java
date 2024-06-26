package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.model.data.Accountant;
import org.fastsped.model.data.CompanyComplement;

import java.util.HashMap;
import java.util.Map;

public class ZeroRegisters implements RegisterFactory {

    private final EfdIcmsIpi efdIcmsIpi;
    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    /**
     * Param required to create the block zero.
     * @param efdIcmsIpi Object that contains all data necessary to generate the EFD Icms Ipi.
     * */
    public ZeroRegisters(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    @Override
    public String getRegisters(String[] registers) {
        String registersGenerates = this.generateRegister0000();
        registersGenerates += this.generateRegister0001();
        registersGenerates += this.generateRegister0002(registers);
        registersGenerates += this.generateRegister0005();
        registersGenerates += this.generateRegister0100();
        registersGenerates += this.closeRegister("0", this.quantity);
        RegisterUtil.addQuantityRegs("0990", this.quantityPerRegister);
        return registersGenerates;
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return  this.quantityPerRegister;
    }

    private String generateRegister0000() {
        Register register = new Register0000(this.efdIcmsIpi);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0000", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0001() {
        Register register = new Register0001(Index.CONTENT);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0002(String[] registers) {
        if(RegisterUtil.containRegister(registers, "0002")) {
            return "";
        }
        Register register = new Register0002("1");
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0002", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0005() {
        CompanyComplement companyComplement = this.efdIcmsIpi.getCompanyComplement();
        Register register = new Register0005(companyComplement);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0005", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0100() {
        Accountant accountant = this.efdIcmsIpi.getAccountant();
        Register register = new Register0100(accountant);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0100", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
