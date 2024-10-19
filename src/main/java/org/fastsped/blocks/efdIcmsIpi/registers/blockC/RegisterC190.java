package org.fastsped.blocks.efdIcmsIpi.registers.blockC;

import org.fastsped.blocks.efdIcmsIpi.registers.blockC.helps.RegC190Data;
import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.EFDFormatter;
import org.fastsped.interfaces.Register;

public class RegisterC190 implements Register {

    private final RegC190Data regC190Data;

        public RegisterC190(RegC190Data regC190Data) {
        this.regC190Data = regC190Data;
    }

    @Override
    public String generateRegister() {
        return BuilderRegister.builder("C190")
                .add(EFDFormatter.cstIcms(this.regC190Data.getCstIcms())).add(this.regC190Data.getCfop())
                .add(this.regC190Data.getAliqIcms()).add(EFDFormatter.bigDecimal(this.regC190Data.getVlOpr()))
                .add(EFDFormatter.bigDecimal(this.regC190Data.getVlBcIcms()))
                .add(EFDFormatter.bigDecimal(this.regC190Data.getVlIcms()))
                .add(EFDFormatter.bigDecimal(this.regC190Data.getVlBcIcmsSt()))
                .add(EFDFormatter.bigDecimal(this.regC190Data.getVlIcmsSt()))
                .add(EFDFormatter.bigDecimal(this.regC190Data.getVlRedBc()))
                .add(EFDFormatter.bigDecimal(this.regC190Data.getVlIpi())).add(this.regC190Data.getCodObs())
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 1;
    }
}
