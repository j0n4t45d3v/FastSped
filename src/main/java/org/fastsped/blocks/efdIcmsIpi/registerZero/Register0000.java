package org.fastsped.blocks.efdIcmsIpi.registerZero;

import org.fastsped.exceptions.CnpjAndCpfIsNullException;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.interfaces.Register;
import org.fastsped.commons.BuilderRegister;

/**
* Class: Register0000.
 * Contains the implementation of the Register0000 in the Block 0.
*/

public class Register0000 implements Register {

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
    private String indPerfil;
    private String indAtiv;

    public Register0000(EfdIcmsIpi efdIcmsIpi) {
        this.codVer = efdIcmsIpi.getOpeningEfd().getCodVer();
        this.codFin = efdIcmsIpi.getOpeningEfd().getCodFin();
        this.dtIni = efdIcmsIpi.getOpeningEfd().getDtIni();
        this.dtFin = efdIcmsIpi.getOpeningEfd().getDtFin();
        this.nome = efdIcmsIpi.getOpeningEfd().getNome();
        this.cnpj = efdIcmsIpi.getOpeningEfd().getCnpj();
        this.cpf = efdIcmsIpi.getOpeningEfd().getCpf();
        this.uf = efdIcmsIpi.getOpeningEfd().getUf();
        this.ie = efdIcmsIpi.getOpeningEfd().getIe();
        this.codMun = efdIcmsIpi.getOpeningEfd().getCodMun();
        this.im = efdIcmsIpi.getOpeningEfd().getIm();
        this.suframa = efdIcmsIpi.getOpeningEfd().getSuframa();
        this.indPerfil = efdIcmsIpi.getProfile().name();
        this.indAtiv = efdIcmsIpi.getOpeningEfd().getIndAtiv();
    }

    @Override
    public String generateRegister() {
        if(this.cnpj == null && this.cpf == null){
            throw new CnpjAndCpfIsNullException();
        }
        return BuilderRegister.builder("0000")
                .add(codVer).add(codFin)
                .add(dtIni).add(dtFin)
                .add(nome).add(cnpj)
                .add(cpf).add(uf)
                .add(ie).add(codMun)
                .add(im).add(suframa)
                .add(indPerfil).add(indAtiv)
                .build();
    }

    @Override
    public int getQuantityLines() {
        return 0;
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

    public String getIndPerfil() {
        return indPerfil;
    }

    public void setIndPerfil(String indPerfil) {
        this.indPerfil = indPerfil;
    }

    public String getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }

}
