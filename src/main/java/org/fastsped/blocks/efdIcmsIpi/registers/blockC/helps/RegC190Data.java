package org.fastsped.blocks.efdIcmsIpi.registers.blockC.helps;

import java.math.BigDecimal;

public class RegC190Data {
    private String cstIcms;
    private String cfop;
    private String aliqIcms;
    private BigDecimal vlOpr;
    private BigDecimal vlBcIcms;
    private BigDecimal vlIcms;
    private BigDecimal vlBcIcmsSt;
    private BigDecimal vlIcmsSt;
    private BigDecimal vlRedBc;
    private BigDecimal vlIpi;
    private String codObs;

    public RegC190Data(
            String cstIcms, String cfop, String aliqIcms, BigDecimal vlOpr, BigDecimal vlBcIcms,
            BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlRedBc,
            BigDecimal vlIpi, String codObs
    ) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.vlRedBc = vlRedBc;
        this.vlIpi = vlIpi;
        this.codObs = codObs;
    }

    public RegC190Data() {
        this.vlOpr = BigDecimal.ZERO;
        this.vlBcIcms = BigDecimal.ZERO;
        this.vlIcms = BigDecimal.ZERO;
        this.vlBcIcmsSt = BigDecimal.ZERO;
        this.vlIcmsSt = BigDecimal.ZERO;
        this.vlRedBc = BigDecimal.ZERO;
        this.vlIpi = BigDecimal.ZERO;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(String aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
}
