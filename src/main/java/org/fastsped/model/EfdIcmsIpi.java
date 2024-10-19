package org.fastsped.model;

import org.fastsped.model.data.*;
import org.fastsped.commons.enums.Profile;

import java.util.List;

public class EfdIcmsIpi {

    private OpeningEfd openingEfd;
    private CompanyComplement companyComplement;
    private Accountant accountant;
    private List<Invoice> invoices;
    private List<Unit> units;
    private List<Product> products;
    private Profile profile;


    public EfdIcmsIpi(
            OpeningEfd openingEfd,
            CompanyComplement companyComplement,
            Accountant accountant,
            List<Unit> units,
            List<Product> products,
            List<Invoice> invoices,
            Profile profile
    ) {
        this.openingEfd = openingEfd;
        this.companyComplement = companyComplement;
        this.accountant = accountant;
        this.units = units;
        this.products = products;
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

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
