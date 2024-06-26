package org.fastsped.model.data;

/**
 * Representa um contador responsável pela escrituração fiscal digital (EFD).
 */
public class Accountant {
    private String name;
    private String cpf;
    private String crc;
    private String cnpj;
    private String cep;
    private String end;
    private String num;
    private String compl;
    private String bairro;
    private String fone;
    private String fax;
    private String email;
    private String codMun;

    /**
     * Constrói um objeto `Accountant` com os dados fornecidos.
     * @param name Nome do contador.
     * @param cpf CPF do contador.
     * @param crc CRC (Conselho Regional de Contabilidade) do contador.
     * @param cnpj CNPJ do contador (se pessoa jurídica).
     * @param cep CEP do endereço do contador.
     * @param end Endereço do contador.
     * @param num Número do endereço do contador.
     * @param compl Complemento do endereço do contador.
     * @param bairro Bairro do endereço do contador.
     * @param fone Telefone do contador.
     * @param fax Fax do contador.
     * @param email Email do contador.
     * @param codMun Código do município do contador.
     */
    public Accountant(
            String name, String cpf, String crc, String cnpj, String cep, String end,
            String num, String compl, String bairro, String fone, String fax, String email,
            String codMun
    ) {
        this.name = name;
        this.cpf = cpf;
        this.crc = crc;
        this.cnpj = cnpj;
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

    /**
     * Construtor padrão de `Accountant`.
     */
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
