package org.fastsped.blocks.efdIcmsIpi.registers.blockNine;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.interfaces.Register;

/**
 * Implementação da interface {@link Register} para o registro 9900 do EFD ICMS IPI.
 * Este registro é utilizado para totalizar a quantidade de linhas de registros dentro de um bloco.
 */
public class Register9900 implements Register {

    private String register;
    private int quantity;

    /**
     * Construtor da classe {@code Register9900}.
     *
     * @param register Identificação do tipo de registro (ex.: "9900").
     * @param quantity Quantidade de registros no tipo especificado.
     */
    public Register9900(String register, int quantity) {
        this.register = register;
        this.quantity = quantity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("9900")
                .add(this.register)
                .add(String.valueOf(this.quantity))
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getQuantityLines() {
        return 0;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
