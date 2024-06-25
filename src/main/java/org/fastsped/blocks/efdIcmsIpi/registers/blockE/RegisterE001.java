package org.fastsped.blocks.efdIcmsIpi.registers.blockE;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.Index;
import org.fastsped.interfaces.Register;

public class RegisterE001 implements Register {
    private final Index index;

    public RegisterE001(Index index) {
        this.index = index;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("E001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
