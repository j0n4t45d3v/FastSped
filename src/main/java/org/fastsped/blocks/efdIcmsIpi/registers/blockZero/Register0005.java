package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.model.data.CompanyComplement;
import org.fastsped.interfaces.Register;
import org.fastsped.commons.BuilderRegister;

public class Register0005 implements Register {
    private CompanyComplement companyComplement;


    public Register0005(CompanyComplement companyComplement) {
        this.companyComplement = companyComplement;
    }


    @Override
    public String generateRegister() {
        return BuilderRegister.builder("0005")
                .add(this.companyComplement.getFantasia())
                .add(this.companyComplement.getCep())
                .add(this.companyComplement.getEnd())
                .add(this.companyComplement.getNum())
                .add(this.companyComplement.getCompl())
                .add(this.companyComplement.getBairro())
                .add(this.companyComplement.getFone())
                .add(this.companyComplement.getFax())
                .add(this.companyComplement.getEmail())
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }

    public CompanyComplement getCompanyComplement() {
        return companyComplement;
    }

    public void setCompanyComplement(CompanyComplement companyComplement) {
        this.companyComplement = companyComplement;
    }
}
