package org.fastsped.blocks.efdIcmsIpi.registers.blockG;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.Index;
import org.fastsped.interfaces.Register;

public class RegisterG001 implements Register {
    private Index index;

    public RegisterG001(Index index) {
        this.index = index;
    }


    @Override
    public String generateRegister() {
        return BuilderRegister.builder("G001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
