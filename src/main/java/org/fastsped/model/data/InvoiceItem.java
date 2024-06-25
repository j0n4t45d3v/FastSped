package org.fastsped.model.data;

import java.math.BigDecimal;

public class InvoiceItem {
    private String codItem;
    private String descrCompl;
    private String quant;
    private String unid;
    private BigDecimal vlItem;
    private BigDecimal vlDesc;
    private String indMov;
    private String cstIcms;
    private String cfop;
    private String codNat;
    private BigDecimal vlBcIcms;
    private BigDecimal alqIcms;
    private BigDecimal vlIcms;
    private BigDecimal vlBcIcmsSt;
    private BigDecimal alqIcmsSt;
    private BigDecimal vlIcmsSt;
    private String indApur;
    private String cstIpi;
    private String codEnq;
    private BigDecimal vlBcIpi;
    private BigDecimal aliqIpi;
    private BigDecimal vlIpi;
    private String cstPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPisPercetual;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private String cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofinsPercetual;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
    private BigDecimal vlAbatNt;

    public InvoiceItem(
            String codItem, String descrCompl, String quant, String unid, BigDecimal vlItem,
            BigDecimal vlDesc, String indMov, String cstIcms, String cfop, String codNat,
            BigDecimal vlBcIcms, BigDecimal alqIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt,
            BigDecimal alqIcmsSt, BigDecimal vlIcmsSt, String indApur, String cstIpi,
            String codEnq, BigDecimal vlBcIpi, BigDecimal aliqIpi, BigDecimal vlIpi,
            String cstPis, BigDecimal vlBcPis, BigDecimal aliqPisPercetual, BigDecimal quantBcPis,
            BigDecimal aliqPis, BigDecimal vlPis, String cstCofins, BigDecimal vlBcCofins,
            BigDecimal aliqCofinsPercetual, BigDecimal quantBcCofins, BigDecimal aliqCofins,
            BigDecimal vlCofins, String codCta, BigDecimal vlAbatNt
    ) {
        this.codItem = codItem;
        this.descrCompl = descrCompl;
        this.quant = quant;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.indMov = indMov;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.codNat = codNat;
        this.vlBcIcms = vlBcIcms;
        this.alqIcms = alqIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.alqIcmsSt = alqIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.indApur = indApur;
        this.cstIpi = cstIpi;
        this.codEnq = codEnq;
        this.vlBcIpi = vlBcIpi;
        this.aliqIpi = aliqIpi;
        this.vlIpi = vlIpi;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPisPercetual = aliqPisPercetual;
        this.quantBcPis = quantBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofinsPercetual = aliqCofinsPercetual;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.vlAbatNt = vlAbatNt;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
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

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getAlqIcms() {
        return alqIcms;
    }

    public void setAlqIcms(BigDecimal alqIcms) {
        this.alqIcms = alqIcms;
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

    public BigDecimal getAlqIcmsSt() {
        return alqIcmsSt;
    }

    public void setAlqIcmsSt(BigDecimal alqIcmsSt) {
        this.alqIcmsSt = alqIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public String getIndApur() {
        return indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public String getCodEnq() {
        return codEnq;
    }

    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }

    public BigDecimal getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public BigDecimal getAliqIpi() {
        return aliqIpi;
    }

    public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPisPercetual() {
        return aliqPisPercetual;
    }

    public void setAliqPisPercetual(BigDecimal aliqPisPercetual) {
        this.aliqPisPercetual = aliqPisPercetual;
    }

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofinsPercetual() {
        return aliqCofinsPercetual;
    }

    public void setAliqCofinsPercetual(BigDecimal aliqCofinsPercetual) {
        this.aliqCofinsPercetual = aliqCofinsPercetual;
    }

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }
}
