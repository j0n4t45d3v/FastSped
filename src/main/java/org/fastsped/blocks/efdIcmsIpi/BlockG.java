package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockG.GRegister;
import org.fastsped.blocks.efdIcmsIpi.registers.blockH.HRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

public class BlockG implements Block {
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new GRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
