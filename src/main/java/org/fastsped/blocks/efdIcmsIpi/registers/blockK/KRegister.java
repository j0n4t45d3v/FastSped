package org.fastsped.blocks.efdIcmsIpi.registers.blockK;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import static org.fastsped.commons.Index.CONTENT;
import static org.fastsped.commons.Index.NOT_CONTENT;

public class KRegister implements RegisterFactory {
    private int quantity;

    public KRegister() {
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterK001(true));
        registersGenerated.append(this.closeRegister("K", this.quantity));
        return registersGenerated.toString();
    }

    private String generateRegisterK001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new RegisterK001(index);
        this.quantity ++;
        return RegisterUtil.generateRegister(register);
    }
}
