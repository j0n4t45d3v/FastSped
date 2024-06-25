package org.fastsped.blocks.efdIcmsIpi.registers.blockB;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import static org.fastsped.commons.Index.CONTENT;
import static org.fastsped.commons.Index.NOT_CONTENT;

public class BRegister implements RegisterFactory {
    private int quantity;

    public BRegister() {
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterB001(true));
        registersGenerated.append(this.closeRegister("B", this.quantity));
        return registersGenerated.toString();
    }

    private String generateRegisterB001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new RegisterB001(index);
        this.quantity ++;
        return RegisterUtil.generateRegister(register);
    }
}
