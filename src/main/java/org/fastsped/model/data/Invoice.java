package org.fastsped.model.data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Invoice {
    private String indOper;
    private String indEmit;
    private String codPart;
    private String codMod;
    private String codSit;
    private String ser;
    private String numDoc;
    private String chvNfe;
    private Date dtDoc;
    private Date dtES;
    private BigDecimal vlDoc;
    private String indPgto;
    private BigDecimal vlDesc;
    private BigDecimal vlAbatNt;
    private BigDecimal vlMerc;
    private String indFrt;
    private BigDecimal vlFrt;
    private BigDecimal vlSeg;
    private BigDecimal vlOutDa;
    private BigDecimal vlBcIcms;
    private BigDecimal vlIcms;
    private BigDecimal vlBcIcmsSt;
    private BigDecimal vlIcmsSt;
    private BigDecimal vlIpi;
    private BigDecimal vlPis;
    private BigDecimal vlCofins;
    private BigDecimal vlPisSt;
    private BigDecimal vlCofinsSt;
    private List<InvoiceItem> invoiceItems;

    public Invoice(
            String indOper, String indEmit, String codPart, String codMod,
            String codSit,String ser, String numDoc, String chvNfe, Date dtDoc,
            Date dtES, BigDecimal vlDoc, String indPgto, BigDecimal vlDesc,
            BigDecimal vlAbatNt, BigDecimal vlMerc, String indFrt,
            BigDecimal vlFrt, BigDecimal vlSeg, BigDecimal vlOutDa,
            BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt,
            BigDecimal vlIcmsSt, BigDecimal vlIpi, BigDecimal vlPis,
            BigDecimal vlCofins, BigDecimal vlPisSt, BigDecimal vlCofinsSt,
            List<InvoiceItem> invoiceItems
    ) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.dtES = dtES;
        this.vlDoc = vlDoc;
        this.indPgto = indPgto;
        this.vlDesc = vlDesc;
        this.vlAbatNt = vlAbatNt;
        this.vlMerc = vlMerc;
        this.indFrt = indFrt;
        this.vlFrt = vlFrt;
        this.vlSeg = vlSeg;
        this.vlOutDa = vlOutDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.vlIpi = vlIpi;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.vlPisSt = vlPisSt;
        this.vlCofinsSt = vlCofinsSt;
        this.invoiceItems = invoiceItems;
    }

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Date getDtES() {
        return dtES;
    }

    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public String getIndPgto() {
        return indPgto;
    }

    public void setIndPgto(String indPgto) {
        this.indPgto = indPgto;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public String getIndFrt() {
        return indFrt;
    }

    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }

    public BigDecimal getVlFrt() {
        return vlFrt;
    }

    public void setVlFrt(BigDecimal vlFrt) {
        this.vlFrt = vlFrt;
    }

    public BigDecimal getVlSeg() {
        return vlSeg;
    }

    public void setVlSeg(BigDecimal vlSeg) {
        this.vlSeg = vlSeg;
    }

    public BigDecimal getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
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

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public BigDecimal getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(BigDecimal vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public BigDecimal getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(BigDecimal vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
