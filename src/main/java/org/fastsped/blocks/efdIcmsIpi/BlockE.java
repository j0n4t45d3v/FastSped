package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockE.ERegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

public class BlockE implements Block {

    private Map<String, Integer> quantityPerRegister;

        public BlockE() {
        this.quantityPerRegister = null;
    }

    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new ERegister();
        this.quantityPerRegister = factory.getQuantityPerRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public Map<String, Integer> getQuantityLines() {
        return this.quantityPerRegister;
    }
}
