package efdfiscal;

import org.fastsped.EFDIcmsIpiGenerate;
import org.fastsped.commons.enums.Profile;
import org.fastsped.interfaces.GenerateEfd;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.model.data.*;

import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EfdIcmsIpi efdIcmsIpi = new EfdIcmsIpi();
        efdIcmsIpi.setOpeningEfd(createOpeningEfd());
        efdIcmsIpi.setCompanyComplement(createCompanyComplement());
        efdIcmsIpi.setAccountant(createAccountant());
        efdIcmsIpi.setUnits(createUnits());
        efdIcmsIpi.setProducts(createProducts());
        efdIcmsIpi.setInvoices(createInvoices());
        efdIcmsIpi.setProfile(Profile.B);

        GenerateEfd generateEfd = new EFDIcmsIpiGenerate();
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
        opening.setCodVer("018");
        opening.setCodFin("0");
        opening.setDtIni("01122024");
        opening.setDtFin("31122024");
        opening.setNome("EMPRESA TESTE");
        opening.setCnpj("12345678901234");
        opening.setCpf("");
        opening.setUf("SP");
        opening.setIe("123456789012");
        opening.setCodMun("3500105");
        opening.setIm("123456789012");
        opening.setSuframa("123456789");
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

    private static List<Unit> createUnits() {
        Unit unit1 = new Unit("1", "UN");
        Unit unit2 = new Unit("2", "KG");
        return Arrays.asList(unit1, unit2);
    }

    private static List<Product> createProducts() {
        Product product1 = new Product(
                "001", "Produto A", "1234567890123", "0001",
                "1", "00", "1234.56.78", "001", "12",
                "12345", new BigDecimal("18.0"), "0100100"
        );

        Product product2 = new Product(
                "002", "Produto B", "9876543210987", "0002",
                "2", "01", "8765.43.21", "002", "34",
                "54321", new BigDecimal("12.0"), "0100200"
        );
        return Arrays.asList(product1, product2);
    }

    private static List<Invoice> createInvoices() {
        //1 = UN, 2 = KG
        InvoiceItem item1 = new InvoiceItem(
                "001", "Item 1 description", "10", 1, new BigDecimal("100.00"), new BigDecimal("10.00"), "1",
                "00", "5102", "1001", new BigDecimal("90.00"), new BigDecimal("18.00"), new BigDecimal("16.20"),
                new BigDecimal("80.00"), new BigDecimal("18.00"), new BigDecimal("14.40"), "0", "50", "001",
                new BigDecimal("80.00"), new BigDecimal("10.00"), new BigDecimal("8.00"), "01", new BigDecimal("80.00"),
                new BigDecimal("1.65"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("1.32"), "01",
                new BigDecimal("80.00"), new BigDecimal("7.60"), new BigDecimal("0"), new BigDecimal("0"),
                new BigDecimal("6.08"), "0000", new BigDecimal("0")
        );

        InvoiceItem item2 = new InvoiceItem(
                "002", "Item 2 description", "20", 2, new BigDecimal("200.00"), new BigDecimal("20.00"), "0",
                "10", "6102", "2001", new BigDecimal("180.00"), new BigDecimal("17.00"), new BigDecimal("30.60"),
                new BigDecimal("150.00"), new BigDecimal("17.00"), new BigDecimal("25.50"), "1", "49", "002",
                new BigDecimal("150.00"), new BigDecimal("15.00"), new BigDecimal("22.50"), "02", new BigDecimal("150.00"),
                new BigDecimal("1.65"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("2.47"), "02",
                new BigDecimal("150.00"), new BigDecimal("7.60"), new BigDecimal("0"), new BigDecimal("0"),
                new BigDecimal("11.40"), "1111", new BigDecimal("0")
        );

        Invoice invoice1 = new Invoice(
                "1", "1", "001", "55", "00", "1", "123456",
                "12345678901234567890123456789012345678901234",new Date(), new Date(),
                new BigDecimal("1000.00"), "0", new BigDecimal("50.00"), new BigDecimal("0.00"),
                new BigDecimal("950.00"), "1", new BigDecimal("100.00"), new BigDecimal("20.00"),
                new BigDecimal("30.00"), new BigDecimal("900.00"), new BigDecimal("180.00"),
                new BigDecimal("100.00"), new BigDecimal("20.00"), new BigDecimal("10.00"),
                new BigDecimal("15.00"), new BigDecimal("5.00"), new BigDecimal("3.00"),
                new BigDecimal("2.00"), Arrays.asList(item1, item2)
        );

        Invoice invoice2 = new Invoice(
                "0", "0", "002", "01", "01", "2", "654321",
                "09876543210987654321098765432109876543210987", new Date(), new Date(),
                new BigDecimal("2000.00"), "1", new BigDecimal("100.00"), new BigDecimal("50.00"),
                new BigDecimal("1850.00"), "0", new BigDecimal("200.00"), new BigDecimal("50.00"),
                new BigDecimal("40.00"), new BigDecimal("1700.00"), new BigDecimal("340.00"),
                new BigDecimal("200.00"), new BigDecimal("40.00"), new BigDecimal("20.00"),
                new BigDecimal("30.00"), new BigDecimal("10.00"), new BigDecimal("5.00"),
                new BigDecimal("3.00"), Arrays.asList(item1, item2)
        );

        return Arrays.asList(invoice1, invoice2);
    }
}
