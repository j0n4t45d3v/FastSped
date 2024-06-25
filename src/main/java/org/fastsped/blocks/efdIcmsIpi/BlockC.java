package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockC.CRegisters;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;

public class BlockC implements Block {

    private final EfdIcmsIpi efdIcmsIpi;

    public BlockC(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
    }

    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new CRegisters(this.efdIcmsIpi);
        String[] regs = {};
        String block = factory.getRegisters(regs);
        return block.getBytes();
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
