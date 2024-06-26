package org.fastsped.model;

import org.fastsped.model.data.Accountant;
import org.fastsped.model.data.CompanyComplement;
import org.fastsped.model.data.Invoice;
import org.fastsped.model.data.OpeningEfd;
import org.fastsped.commons.Profile;

import java.util.List;

/**
 * Classe responsável por armazenar os dados necessários para gerar o EFD ICMS IPI.
 * <p>
 * Esta classe encapsula os dados essenciais para a geração dos blocos do EFD ICMS IPI,
 * incluindo informações de abertura, complemento da empresa, contador, faturas e perfil da empresa, entre outros.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * // Exemplo de criação de um objeto EfdIcmsIpi
 * EfdIcmsIpi efdIcmsIpi = new EfdIcmsIpi(openingEfd, companyComplement, accountant, invoices, profile);
 * }</pre>
 * </p>
 * <p>
 * Os parâmetros fornecidos no construtor descrevem os dados específicos necessários para cada bloco
 * dentro do EFD ICMS IPI:
 * <ul>
 * <li>{@code openingEfd}: Dados necessários para gerar o bloco de abertura do EFD ICMS IPI.</li>
 * <li>{@code companyComplement}: Dados necessários para gerar o bloco de complemento da empresa.</li>
 * <li>{@code accountant}: Dados necessários para gerar o bloco do contador.</li>
 * <li>{@code invoices}: Lista de faturas contendo os dados para os blocos relacionados às faturas.</li>
 * <li>{@code profile}: Perfil da empresa contendo informações adicionais.</li>
 * <li>...</li>
 * </ul>
 * </p>
 * <p>
 * Cada método getter e setter permite o acesso e a modificação dos dados encapsulados dentro desta classe,
 * facilitando a integração e o processamento dos dados necessários para gerar o arquivo EFD ICMS IPI.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class EfdIcmsIpi {

    private OpeningEfd openingEfd;
    private CompanyComplement companyComplement;
    private Accountant accountant;
    private List<Invoice> invoices;
    private Profile profile;

    /**
     * Constrói uma instância de EfdIcmsIpi com os dados fornecidos.
     * @param openingEfd Objeto contendo os dados de abertura do EFD ICMS IPI.
     * @param companyComplement Objeto contendo os dados de complemento da empresa no EFD ICMS IPI.
     * @param accountant Objeto contendo os dados do contador no EFD ICMS IPI.
     * @param invoices Lista de faturas contendo os dados para os blocos relacionados às faturas no EFD ICMS IPI.
     * @param profile Perfil da empresa contendo informações adicionais.
     */
    public EfdIcmsIpi(
            OpeningEfd openingEfd,
            CompanyComplement companyComplement,
            Accountant accountant,
            List<Invoice> invoices,
            Profile profile
    ) {
        this.openingEfd = openingEfd;
        this.companyComplement = companyComplement;
        this.accountant = accountant;
        this.invoices = invoices;
        this.profile = profile;
    }

    /**
     * Constrói uma instância vazia de EfdIcmsIpi.
     */
    public EfdIcmsIpi() {
    }

    public OpeningEfd getOpeningEfd() {
        return openingEfd;
    }

    public void setOpeningEfd(OpeningEfd openingEfd) {
        this.openingEfd = openingEfd;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public CompanyComplement getCompanyComplement() {
        return companyComplement;
    }

    public void setCompanyComplement(CompanyComplement companyComplement) {
        this.companyComplement = companyComplement;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
