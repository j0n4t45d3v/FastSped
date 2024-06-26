package org.fastsped.blocks.efdIcmsIpi.registers.blockOne;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;
import org.fastsped.interfaces.Register;

public class Register1001 implements Register {
    public Register1001(Index index) {
        this.index = index;
    }

    private final Index index;

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("1001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
