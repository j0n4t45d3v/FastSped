package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockZero.ZeroRegisters;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;

import java.util.Map;

public class BlockZero implements Block {

    private final EfdIcmsIpi efdIcmsIpi;
    private Map<String, Integer> quantityPerRegister;

        public BlockZero(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantityPerRegister = null;
    }

    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new ZeroRegisters(this.efdIcmsIpi);
        this.quantityPerRegister = factory.getQuantityPerRegister();
        String[] regs = {"0002"};
        return BlockUtil.generateBlock(factory, regs);
    }

    @Override
    public Map<String, Integer> getQuantityLines() {
        return this.quantityPerRegister;
    }
}
