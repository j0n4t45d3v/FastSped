package org.fastsped.blocks.efdIcmsIpi.registers.blockB;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;
import org.fastsped.interfaces.Register;

public class RegisterB001 implements Register {

    private final Index index;

    public RegisterB001(Index index) {
        this.index = index;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("B001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
