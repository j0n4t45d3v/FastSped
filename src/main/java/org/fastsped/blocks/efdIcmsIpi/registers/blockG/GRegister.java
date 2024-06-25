package org.fastsped.blocks.efdIcmsIpi.registers.blockG;

import org.fastsped.blocks.efdIcmsIpi.registers.blockD.RegisterD001;
import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import static org.fastsped.commons.Index.CONTENT;
import static org.fastsped.commons.Index.NOT_CONTENT;

public class GRegister implements RegisterFactory {
    private int quantity;

    public GRegister() {
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterG001(true));
        registersGenerated.append(this.closeRegister("G", this.quantity));
        return registersGenerated.toString();
    }

    private String generateRegisterG001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT : CONTENT;
        Register register = new RegisterG001(index);
        this.quantity ++;
        return RegisterUtil.generateRegister(register);
    }
}
