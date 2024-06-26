package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.EFDFormatter;
import org.fastsped.interfaces.Register;
import org.fastsped.model.data.Product;
import org.fastsped.model.data.Unit;

/**
 * Implementação da interface {@link Register} para o registro 0000 do Bloco 0 do EFD ICMS IPI.
 * Este registro contém informações dos produtos do arquivo EFD ICMS IPI.
 */
public class Register0200 implements Register {

    private Product product;

    /**
     * Construtor da classe {@code Register0200}.
     *
     * @param product Objeto {@link Product} contendo os dados dos produtos do EFD ICMS IPI.
     */
    public Register0200(Product product) {
        this.product = product;
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
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