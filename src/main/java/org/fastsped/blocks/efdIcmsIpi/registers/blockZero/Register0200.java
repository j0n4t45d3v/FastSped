package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.EFDFormatter;
import org.fastsped.interfaces.Register;
import org.fastsped.model.data.Product;
import org.fastsped.model.data.Unit;

public class Register0200 implements Register {

    private Product product;

        public Register0200(Product product) {
        this.product = product;
    }

    @Override
    public String generateRegister() {

        return BuilderRegister.builder("0200")
                .add(this.product.getCodItem()).add(this.product.getDescrItem())
                .add(this.product.getCodBarra()).add(this.product.getCodAntItem())
                .add(this.product.getUnidInv()).add(this.product.getTipoItem())
                .add(EFDFormatter.cleanString(this.product.getCodNcm())).add(this.product.getExIpi())
                .add(this.product.getCodGen()).add(this.product.getCodLst())
                .add(EFDFormatter.bigDecimal(this.product.getAliqIcms())).add(this.product.getCest())
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}