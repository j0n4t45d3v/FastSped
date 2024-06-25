package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.Register;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.blocks.efdIcmsIpi.registerZero.*;
import org.fastsped.commons.Index;

/**
 * Class representation block zero in the EFD Icms Ipi.
 * This block is used to generate the file header.
 * The block zero is the first block in the EFD Icms Ipi.
 * */
public class BlockZero implements Block {

    private EfdIcmsIpi efdIcmsIpi;

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
        StringBuilder block = new StringBuilder();
        block.append(this.generateRegister0000());
        block.append(this.generateRegister0001());
        block.append(this.generateRegister0005());
        block.append(this.generateRegister0100());
        return block.toString().getBytes();
    }

    private String generateRegister0000() {
        Register register = new Register0000(this.efdIcmsIpi);
        return this.generateRegister(register);
    }

    private String generateRegister0001() {
        Register register = new Register0001(Index.CONTENT);
        return this.generateRegister(register);
    }

    private String generateRegister0002() {
        Register register = new Register0002("1");
        return this.generateRegister(register);
    }

    private String generateRegister0005() {
        Register register = new Register0005(this.efdIcmsIpi.getCompanyComplement());
        return this.generateRegister(register);
    }

    private String generateRegister0100() {
        Register register = new Register0100(this.efdIcmsIpi.getAccountant());
        return this.generateRegister(register);
    }

    private String generateRegister(Register register) {
        return register.generateRegister();
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}