package efdfiscal;

import org.fastsped.commons.Profile;
import org.fastsped.interfaces.GenerateEfd;
import org.fastsped.EFDIcmsIpi;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.model.data.Accountant;
import org.fastsped.model.data.CompanyComplement;
import org.fastsped.model.data.OpeningEfd;

import java.io.File;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        OpeningEfd opening = createOpeningEfd();
        CompanyComplement companyComplement = createCompanyComplement();
        Accountant accountant = createAccountant();
        EfdIcmsIpi efdIcmsIpi = new EfdIcmsIpi();
        efdIcmsIpi.setOpeningEfd(opening);
        efdIcmsIpi.setCompanyComplement(companyComplement);
        efdIcmsIpi.setAccountant(accountant);
        efdIcmsIpi.setProfile(Profile.A);

        GenerateEfd generateEfd = new EFDIcmsIpi();
        String pathGenerateSped = Paths.get("sped").toAbsolutePath().toString();
        System.out.println("\n===========================GENERATE SPED FILE==================================\n");
        generateEfd.generateEfdFileInDirectory(efdIcmsIpi, pathGenerateSped + "/TESTE_EFD_ICMS_IPI.txt");
        System.out.println("\n===========================GENERATE SPED FILE OBJECT=====================================\n");
        File spedFile = generateEfd.generateEfdToFile(efdIcmsIpi, pathGenerateSped + "/TESTE_EFD_ICMS_FILE_IPI.txt");
        System.out.println("File " + spedFile.getAbsolutePath());
        System.out.println("\n=============================GENERATE SPED STRING================================\n");
        System.out.println(generateEfd.generateEfdString(efdIcmsIpi));
        System.out.println("=================================GENERATE SPED BYTE[]=============================\n");
        byte[] spedBytes = generateEfd.generateEfd(efdIcmsIpi);
        System.out.println(new String(spedBytes));
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

    private static Accountant createAccountant() {
        Accountant accountant = new Accountant();
        accountant.setName("Contador TESTE");
        accountant.setCpf("12345678901");
        accountant.setCrc("123456789012");
        accountant.setCep("12345678");
        accountant.setEnd("RUA TESTE");
        accountant.setNum("123");
        accountant.setCompl("AP 123");
        accountant.setBairro("BAIRRO TESTE");
        accountant.setFone("1234567890");
        accountant.setFax("1234567890");
        accountant.setEmail("empresa@teste");
        accountant.setCodMun("1234567");
        return accountant;
    }
}
