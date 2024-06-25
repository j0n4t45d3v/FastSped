package org.fastsped.model;

import org.fastsped.model.data.Accountant;
import org.fastsped.model.data.CompanyComplement;
import org.fastsped.model.data.Invoice;
import org.fastsped.model.data.OpeningEfd;
import org.fastsped.commons.Profile;

import java.util.List;

/**
 * Model responsible to storing the data necessary to generate the EFD ICMS IPI.
 * */
public class EfdIcmsIpi {
    private OpeningEfd openingEfd;
    private CompanyComplement companyComplement;
    private Accountant accountant;
    private List<Invoice> invoices;
    private Profile profile;

    /**
     * @param openingEfd Object that contains necessary data to generate opening block in the EFD Icms Ipi.
     * @param companyComplement Object that contains necessary data to generate the company complement block in the EFD Icms Ipi.
     * @param accountant Object that contains necessary data to generate the accountant block in the EFD Icms Ipi.
     * @param invoices Object that contains necessary data to generate the accountant block in the EFD Icms Ipi.
     * @param profile Profile that contains company profile.
     * */
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
