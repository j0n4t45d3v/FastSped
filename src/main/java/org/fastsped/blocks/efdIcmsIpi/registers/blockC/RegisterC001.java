package org.fastsped.blocks.efdIcmsIpi.registers.blockC;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.Index;
import org.fastsped.interfaces.Register;

public class RegisterC001 implements Register {
    private final Index index;

    public RegisterC001(Index index) {
        this.index = index;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("C001")
                .add(this.index)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
