package org.fastsped.blocks.efdIcmsIpi.registerZero;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.model.data.Accountant;
import org.fastsped.model.data.CompanyComplement;

public class ZeroRegisters implements RegisterFactory {

    private final EfdIcmsIpi efdIcmsIpi;
    private int quantity;
    /**
     * Param required to create the block zero.
     * @param efdIcmsIpi Object that contains all data necessary to generate the EFD Icms Ipi.
     * */
    public ZeroRegisters(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        String registersGenerates = this.generateRegister0000();
        registersGenerates += this.generateRegister0001();
        registersGenerates += this.generateRegister0002(registers);
        registersGenerates += this.generateRegister0005();
        registersGenerates += this.generateRegister0100();
        registersGenerates += this.closeRegister("0", this.quantity);
        return registersGenerates;
    }

    private String generateRegister0000() {
        Register register = new Register0000(this.efdIcmsIpi);
        this.quantity += register.getQuantityLines();
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0001() {
        Register register = new Register0001(Index.CONTENT);
        this.quantity += register.getQuantityLines();
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0002(String[] registers) {
        if(RegisterUtil.containRegister(registers, "0002")) {
            return "";
        }
        Register register = new Register0002("1");
        this.quantity += register.getQuantityLines();
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0005() {
        CompanyComplement companyComplement = this.efdIcmsIpi.getCompanyComplement();
        Register register = new Register0005(companyComplement);
        this.quantity += register.getQuantityLines();
        return RegisterUtil.generateRegister(register);
    }

    private String generateRegister0100() {
        Accountant accountant = this.efdIcmsIpi.getAccountant();
        Register register = new Register0100(accountant);
        this.quantity += register.getQuantityLines();
        return RegisterUtil.generateRegister(register);
    }
}
