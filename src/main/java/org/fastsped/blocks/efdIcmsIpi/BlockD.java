package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockB.BRegister;
import org.fastsped.blocks.efdIcmsIpi.registers.blockD.DRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

public class BlockD implements Block {
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new DRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
