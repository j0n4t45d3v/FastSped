package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.model.data.Accountant;
import org.fastsped.commons.BuilderRegister;
import org.fastsped.interfaces.Register;

public class Register0100 implements Register {
    private Accountant accountant;

    public Register0100(Accountant accountant) {
        this.accountant = accountant;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("0100")
                .add(accountant.getName())
                .add(accountant.getCpf())
                .add(accountant.getCrc())
                .add(accountant.getCep())
                .add(accountant.getEnd())
                .add(accountant.getNum())
                .add(accountant.getCompl())
                .add(accountant.getBairro())
                .add(accountant.getFone())
                .add(accountant.getFax())
                .add(accountant.getEmail())
                .add(accountant.getCodMun())
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
}
