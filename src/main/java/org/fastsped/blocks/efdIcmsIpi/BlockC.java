package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockC.CRegisters;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.model.EfdIcmsIpi;

import java.util.Map;

public class BlockC implements Block {

    private final EfdIcmsIpi efdIcmsIpi;
    private Map<String, Integer> quantityPerRegister;

    public BlockC(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantityPerRegister = null;
    }

    @Override
    public byte[] generateBlock() {
        CRegisters factory = new CRegisters(this.efdIcmsIpi);
        this.quantityPerRegister = factory.getQuantityPerRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public Map<String, Integer> getQuantityLines() {
        return this.quantityPerRegister;
    }
}
