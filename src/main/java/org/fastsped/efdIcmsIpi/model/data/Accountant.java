package org.fastsped.efdIcmsIpi.model.data;

public class Accountant {
    private String name;
    private String cpf;
    private String crc;
    private String cep;
    private String end;
    private String num;
    private String compl;
    private String bairro;
    private String fone;
    private String fax;
    private String email;
    private String codMun;

    public Accountant(
            String name,
            String cpf,
            String crc,
            String cep,
            String end,
            String num,
            String compl,
            String bairro,
            String fone,
            String fax,
            String email,
            String codMun
    ) {
        this.name = name;
        this.cpf = cpf;
        this.crc = crc;
        this.cep = cep;
        this.end = end;
        this.num = num;
        this.compl = compl;
        this.bairro = bairro;
        this.fone = fone;
        this.fax = fax;
        this.email = email;
        this.codMun = codMun;
    }

    public Accountant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }
}
