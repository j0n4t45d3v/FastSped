package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockZero.ZeroRegisters;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;

/**
 * Class representation block zero in the EFD Icms Ipi.
 * This block is used to generate the file header.
 * The block zero is the first block in the EFD Icms Ipi.
 * */
public class BlockZero implements Block {

    private final EfdIcmsIpi efdIcmsIpi;

    /**
     * Param required to create the block zero.
     * @param efdIcmsIpi Object that contains all data necessary to generate the EFD Icms Ipi.
     * */
    public BlockZero(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
    }

    /**
    * Method responsible for generating the block zero of the EFD Icms Ipi.
     * @return byte[] Array of bytes that represents the block zero.
    * */
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new ZeroRegisters(this.efdIcmsIpi);
        String[] regs = {"0002"};
        String block = factory.getRegisters(regs);
        return block.getBytes();
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
