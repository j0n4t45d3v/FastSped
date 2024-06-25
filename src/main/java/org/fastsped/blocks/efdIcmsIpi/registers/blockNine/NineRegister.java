package org.fastsped.blocks.efdIcmsIpi.registers.blockNine;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import static org.fastsped.commons.Index.CONTENT;
import static org.fastsped.commons.Index.NOT_CONTENT;

public class NineRegister implements RegisterFactory {
    private int quantity;

    public NineRegister() {
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegister9001(true));
        registersGenerated.append(this.closeRegister("9", this.quantity));
        return registersGenerated.toString();
    }

    private String generateRegister9001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new Register9001(index);
        this.quantity ++;
        return RegisterUtil.generateRegister(register);
    }
}
