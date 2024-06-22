package org.fastsped.efdIcmsIpi.block.registerZero;

import org.fastsped.efdIcmsIpi.block.interfaces.Register;
import org.fastsped.commons.BuilderRegister;

public class Register0002 implements Register {
    private String clasEstabInd;

    public Register0002(String clasEstabInd) {
        this.clasEstabInd = clasEstabInd;

    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("0002")
                .add(this.clasEstabInd)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }

    public String getClasEstabInd() {
        return clasEstabInd;
    }

    public void setClasEstabInd(String clasEstabInd) {
        this.clasEstabInd = clasEstabInd;
    }
}
