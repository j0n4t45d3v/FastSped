package org.fastsped.efdIcmsIpi.model;

import org.fastsped.efdIcmsIpi.model.data.CompanyComplement;
import org.fastsped.efdIcmsIpi.model.data.OpeningEfd;
import org.fastsped.util.Profile;

/**
 * Model responsible to storing the data necessary to generate the EFD ICMS IPI.
 * */
public class EfdIcmsIpi {
    private OpeningEfd openingEfd;
    private CompanyComplement companyComplement;
    private Profile profile;

    /**
     * @param openingEfd Object that contains necessary data to generate opening block in the EFD Icms Ipi.
     * @param companyComplement Object that contains necessary data to generate the company complement block in the EFD Icms Ipi.
     * @param profile Profile that contains company profile.
     * */
    public EfdIcmsIpi(OpeningEfd openingEfd, CompanyComplement companyComplement, Profile profile) {
        this.openingEfd = openingEfd;
        this.companyComplement = companyComplement;
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
}
