package org.fastsped.blocks.efdIcmsIpi.registers.blockNine;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.interfaces.Register;

public class Register9900 implements Register {

    private String register;
    private int quantity;

        public Register9900(String register, int quantity) {
        this.register = register;
        this.quantity = quantity;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("9900")
                .add(this.register)
                .add(String.valueOf(this.quantity))
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 0;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
