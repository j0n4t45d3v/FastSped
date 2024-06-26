package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockNine.NineRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

public class BlockNine implements Block {
    private Map<String, Integer> quantityRegs;

    public BlockNine() {
        this.quantityRegs = null;
    }

    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new NineRegister(quantityRegs);
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public Map<String, Integer> getQuantityLines() {
        return null;
    }

    public void setQuantityRegs(Map<String, Integer> quantityRegs) {
        this.quantityRegs = quantityRegs;
    }
}
