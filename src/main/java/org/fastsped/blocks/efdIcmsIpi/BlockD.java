package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockD.DRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

public class BlockD implements Block {

    private Map<String, Integer> quantityPerRegister;

        public BlockD() {
        this.quantityPerRegister = null;
    }

    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new DRegister();
        this.quantityPerRegister = factory.getQuantityPerRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public Map<String, Integer> getQuantityLines() {
        return this.quantityPerRegister;
    }
}
