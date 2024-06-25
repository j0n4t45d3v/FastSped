package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockH.HRegister;
import org.fastsped.blocks.efdIcmsIpi.registers.blockK.KRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

public class BlockK implements Block {
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new KRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
