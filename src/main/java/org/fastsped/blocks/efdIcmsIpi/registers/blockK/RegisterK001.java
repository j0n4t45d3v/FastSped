package org.fastsped.blocks.efdIcmsIpi.registers.blockK;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;
import org.fastsped.interfaces.Register;

public class RegisterK001 implements Register {

    private final Index index;

        public RegisterK001(Index index) {
        this.index = index;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("K001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
