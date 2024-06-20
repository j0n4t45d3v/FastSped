package org.fastsped;

import org.fastsped.efdIcmsIpi.GenerateEfd;
import org.fastsped.efdIcmsIpi.GenerateEfdIcmsIpi;
import org.fastsped.efdIcmsIpi.model.EfdIcmsIpi;
import org.fastsped.efdIcmsIpi.model.data.CompanyComplement;
import org.fastsped.efdIcmsIpi.model.data.OpeningEfd;
import org.fastsped.util.Profile;

import java.nio.file.Paths;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        OpeningEfd opening = createOpeningEfd();
        CompanyComplement companyComplement = createCompanyComplement();
        EfdIcmsIpi efdIcmsIpi = new EfdIcmsIpi();
        efdIcmsIpi.setOpeningEfd(opening);
        efdIcmsIpi.setCompanyComplement(companyComplement);
        efdIcmsIpi.setProfile(Profile.A);

        GenerateEfd generateEfd = new GenerateEfdIcmsIpi();
        String pathGenerateSped = Paths.get("sped").toAbsolutePath().toString();
        System.out.println(pathGenerateSped);
        generateEfd.generateEfdFileInDirectory(efdIcmsIpi, pathGenerateSped + "/TESTE_EFD_ICMS_IPI.txt");

    }

    private static OpeningEfd createOpeningEfd() {
        OpeningEfd opening = new OpeningEfd();
        opening.setIndMov("0");
        opening.setCodVer("001");
        opening.setCodFin("0");
        opening.setDtIni("01012020");
        opening.setDtFin("31122020");
        opening.setNome("EMPRESA TESTE");
        opening.setCnpj("12345678901234");
        opening.setCpf("");
        opening.setUf("SP");
        opening.setIe("123456789012");
        opening.setCodMun("1234567");
        opening.setIm("123456789012");
        opening.setSuframa("12345678901234");
        opening.setIndAtiv("1");
        return opening;
    }

    private static CompanyComplement createCompanyComplement() {
        CompanyComplement companyComplement = new CompanyComplement();
        companyComplement.setFantasia("EMPRESA TESTE");
        companyComplement.setCep("12345678");
        companyComplement.setEnd("RUA TESTE");
        companyComplement.setNum("123");
        companyComplement.setCompl("AP 123");
        companyComplement.setBairro("BAIRRO TESTE");
        companyComplement.setFone("1234567890");
        companyComplement.setFax("1234567890");
        companyComplement.setEmail("empresa@teste");
        return companyComplement;
    }
}
