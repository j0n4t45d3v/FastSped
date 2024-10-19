package org.fastsped.blocks.efdIcmsIpi.registers.blockD;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;
import org.fastsped.interfaces.Register;

public class RegisterD001 implements Register {

    private final Index index;

        public RegisterD001(Index index) {
        this.index = index;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("D001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
