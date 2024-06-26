package org.fastsped.model.data;

/**
 * Representa informações de abertura do EFD (Escrituração Fiscal Digital).
 */
public class OpeningEfd {
    private String reg;
    private String indMov;
    private String codVer;
    private String codFin;
    private String dtIni;
    private String dtFin;
    private String nome;
    private String cnpj;
    private String cpf;
    private String uf;
    private String ie;
    private String codMun;
    private String im;
    private String suframa;
    private String indAtiv;

    /**
     * Construtor padrão da classe OpeningEfd.
     */
    public OpeningEfd() {
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public String getCodVer() {
        return codVer;
    }

    public void setCodVer(String codVer) {
        this.codVer = codVer;
    }

    public String getCodFin() {
        return codFin;
    }

    public void setCodFin(String codFin) {
        this.codFin = codFin;
    }

    public String getDtIni() {
        return dtIni;
    }

    public void setDtIni(String dtIni) {
        this.dtIni = dtIni;
    }

    public String getDtFin() {
        return dtFin;
    }

    public void setDtFin(String dtFin) {
        this.dtFin = dtFin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }
}
