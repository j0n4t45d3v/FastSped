package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.interfaces.Register;
import org.fastsped.model.data.Unit;

public class Register0190 implements Register {

    private Unit unit;

        public Register0190(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String generateRegister() {

        return BuilderRegister.builder("0190")
                .add(this.unit.getUnid()).add(this.unit.getDescr())
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}