package org.fastsped.blocks.efdIcmsIpi.registers.blockE;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;
import org.fastsped.interfaces.Register;

/**
 * Implementação da interface {@link Register} para o registro E001 do EFD ICMS IPI.
 * Este registro representa um bloco de dados específico dentro do bloco E.
 */
public class RegisterE001 implements Register {

    private final Index index;

    /**
     * Construtor da classe {@code RegisterE001}.
     *
     * @param index Índice indicando se o bloco está vazio ({@link Index#NOT_CONTENT}) ou contém dados ({@link Index#CONTENT}).
     */
    public RegisterE001(Index index) {
        this.index = index;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("E001")
                .add(this.index)
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getQuantityLines() {
        return 1;
    }
}
