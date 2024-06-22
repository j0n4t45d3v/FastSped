package org.fastsped.efdIcmsIpi.exceptions;

public class CnpjAndCpfIsNullException extends RuntimeException{
    public CnpjAndCpfIsNullException() {
        super("To open the EFD ICMS IPI, the CNPJ or CPF must be informed.");
    }
}
