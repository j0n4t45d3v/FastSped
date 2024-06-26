package org.fastsped.blocks.efdIcmsIpi.registers.blockC;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.EFDFormatter;
import org.fastsped.interfaces.Register;
import org.fastsped.model.data.InvoiceItem;

/**
 * Implementação da interface {@link Register} para o registro C170 do EFD ICMS IPI.
 * Este registro representa um item da nota fiscal dentro do bloco C.
 */
public class RegisterC170 implements Register {

    private final InvoiceItem invoiceItem;
    private final int numItem;

    /**
     * Construtor da classe {@code RegisterC170}.
     *
     * @param invoiceItem Objeto {@link InvoiceItem} que contém os dados do item da nota fiscal.
     * @param numItem     Número do item na nota fiscal.
     */
    public RegisterC170(InvoiceItem invoiceItem, int numItem) {
        this.invoiceItem = invoiceItem;
        this.numItem = numItem;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("C170")
                .add(String.valueOf(this.numItem)).add(this.invoiceItem.getCodItem())
                .add(this.invoiceItem.getDescrCompl()).add(this.invoiceItem.getQuant()).add(this.invoiceItem.getUnid())
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlItem()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlDesc()))
                .add(this.invoiceItem.getIndMov())
                .add(this.invoiceItem.getCstIcms()).add(this.invoiceItem.getCfop()).add(this.invoiceItem.getCodNat())
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlBcIcms()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getAlqIcms()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlIcms()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlBcIcmsSt()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getAlqIcmsSt()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlIcmsSt())).add(this.invoiceItem.getIndApur())
                .add(this.invoiceItem.getCstIpi()).add(this.invoiceItem.getCodEnq())
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlBcIpi()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getAliqIpi()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlIpi()))
                .add(this.invoiceItem.getCstPis()).add(EFDFormatter.bigDecimal(this.invoiceItem.getVlBcPis()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getAliqPisPercetual()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getQuantBcPis()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getAliqPis()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlPis()))
                .add(this.invoiceItem.getCstCofins()).add(EFDFormatter.bigDecimal(this.invoiceItem.getVlBcCofins()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getAliqCofinsPercetual()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getQuantBcCofins()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getAliqCofins()))
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlCofins())).add(this.invoiceItem.getCodCta())
                .add(EFDFormatter.bigDecimal(this.invoiceItem.getVlAbatNt()))
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getQuantityLines() {
        return 1;
    }
}
