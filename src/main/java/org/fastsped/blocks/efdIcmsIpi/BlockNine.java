package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockNine.NineRegister;
import org.fastsped.blocks.efdIcmsIpi.registers.blockOne.OneRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

public class BlockNine implements Block {
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new NineRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
