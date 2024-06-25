package org.fastsped.blocks.efdIcmsIpi.registers.blockC;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.EFDFormatter;
import org.fastsped.interfaces.Register;
import org.fastsped.model.data.Invoice;

public class RegisterC100 implements Register {
    private final Invoice invoice;

    public RegisterC100(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("C100")
                .add(this.invoice.getIndOper()).add(this.invoice.getIndEmit()).add(this.invoice.getCodPart())
                .add(this.invoice.getCodMod()).add(this.invoice.getCodSit()).add(this.invoice.getSer())
                .add(this.invoice.getNumDoc()).add(this.invoice.getChvNfe())
                .add(EFDFormatter.date(this.invoice.getDtDoc())).add(EFDFormatter.date(this.invoice.getDtES()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlDoc())).add(this.invoice.getIndPgto())
                .add(EFDFormatter.bigDecimal(this.invoice.getVlDesc()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlAbatNt()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlMerc())).add(this.invoice.getIndFrt())
                .add(EFDFormatter.bigDecimal(this.invoice.getVlFrt()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlSeg()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlOutDa()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlBcIcms()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlIcms()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlBcIcmsSt()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlIcmsSt()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlIpi()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlPis()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlCofins()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlPisSt()))
                .add(EFDFormatter.bigDecimal(this.invoice.getVlCofinsSt()))
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
