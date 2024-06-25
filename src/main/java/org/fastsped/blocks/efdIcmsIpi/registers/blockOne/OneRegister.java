package org.fastsped.blocks.efdIcmsIpi.registers.blockOne;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import static org.fastsped.commons.Index.CONTENT;
import static org.fastsped.commons.Index.NOT_CONTENT;

public class OneRegister implements RegisterFactory {
    private int quantity;

    public OneRegister() {
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegister1001(true));
        registersGenerated.append(this.closeRegister("1", this.quantity));
        return registersGenerated.toString();
    }

    private String generateRegister1001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new Register1001(index);
        this.quantity ++;
        return RegisterUtil.generateRegister(register);
    }
}
