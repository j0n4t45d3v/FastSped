package org.fastsped.efdIcmsIpi.block.registerZero;

import org.fastsped.efdIcmsIpi.block.interfaces.Register;
import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.Index;

public class Register0001 implements Register {
    private Index index;

    public Register0001(Index index) {
        this.index = index;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("0001")
                .add(String.valueOf(index.getIndex()))
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }
}
