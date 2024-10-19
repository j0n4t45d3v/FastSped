package org.fastsped.blocks.efdIcmsIpi.registers.blockNine;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.interfaces.Register;

public class Register9999 implements Register {

    private int quantity;

        public Register9999(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("9999")
                .add(String.valueOf(this.quantity + 1))
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }

        public int getQuantity() {
        return quantity;
    }

        public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
