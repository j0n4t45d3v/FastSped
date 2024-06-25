package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.interfaces.Register;
import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.Index;

public class Register0001 implements Register {
    private final Index index;

    public Register0001(Index index) {
        this.index = index;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("0001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
