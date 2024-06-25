package org.fastsped.blocks.efdIcmsIpi.registerC;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.EFDFormatter;
import org.fastsped.commons.Index;
import org.fastsped.interfaces.Register;
import org.fastsped.model.data.Invoice;

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
