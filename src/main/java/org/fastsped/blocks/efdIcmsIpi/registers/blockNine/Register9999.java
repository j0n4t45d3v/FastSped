package org.fastsped.blocks.efdIcmsIpi.registers.blockNine;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.interfaces.Register;

/**
 * Implementação da interface {@link Register} para o registro 9999 do EFD ICMS IPI.
 * Este registro é utilizado para encerrar um bloco dentro do EFD ICMS IPI, informando a quantidade total de registros do bloco.
 */
public class Register9999 implements Register {

    private int quantity;

    /**
     * Construtor da classe {@code Register9999}.
     *
     * @param quantity Quantidade de registros no bloco.
     */
    public Register9999(int quantity) {
        this.quantity = quantity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("9999")
                .add(String.valueOf(this.quantity + 1))
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getQuantityLines() {
        return 0;
    }

    /**
     * Obtém a quantidade de registros no bloco.
     *
     * @return Quantidade de registros.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define a quantidade de registros no bloco.
     *
     * @param quantity Quantidade de registros a ser definida.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
