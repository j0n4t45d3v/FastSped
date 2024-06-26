package org.fastsped.model.data;

/**
 * Representa informações complementares da empresa.
 */
public class CompanyComplement {
    private String fantasia;
    private String cep;
    private String end;
    private String num;
    private String compl;
    private String bairro;
    private String fone;
    private String fax;
    private String email;

    /**
     * Construtor que inicializa um objeto `CompanyComplement` com os dados fornecidos.
     * @param fantasia Nome fantasia da empresa.
     * @param cep CEP do endereço da empresa.
     * @param end Endereço da empresa.
     * @param num Número do endereço da empresa.
     * @param compl Complemento do endereço da empresa.
     * @param bairro Bairro do endereço da empresa.
     * @param fone Telefone da empresa.
     * @param fax Fax da empresa.
     * @param email Email da empresa.
     */
    public CompanyComplement(String fantasia, String cep, String end, String num, String compl, String bairro, String fone, String fax, String email) {
        this.fantasia = fantasia;
        this.cep = cep;
        this.end = end;
        this.num = num;
        this.compl = compl;
        this.bairro = bairro;
        this.fone = fone;
        this.fax = fax;
        this.email = email;
    }

    /**
     * Construtor padrão de `CompanyComplement`.
     */
    public CompanyComplement() {
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
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
}
