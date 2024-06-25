package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockD.DRegister;
import org.fastsped.blocks.efdIcmsIpi.registers.blockE.ERegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

public class BlockE implements Block {
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new ERegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
