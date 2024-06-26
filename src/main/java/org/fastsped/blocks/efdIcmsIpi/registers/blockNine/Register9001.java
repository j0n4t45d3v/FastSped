package org.fastsped.blocks.efdIcmsIpi.registers.blockNine;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;
import org.fastsped.interfaces.Register;

/**
 * Implementação da interface {@link Register} para o registro 9001 do EFD ICMS IPI.
 * Este registro representa um controle de totalização de linhas dentro de um bloco específico.
 */
public class Register9001 implements Register {

    private final Index index;

    /**
     * Construtor da classe {@code Register9001}.
     *
     * @param index Índice indicando se o bloco está vazio ({@link Index#NOT_CONTENT}) ou contém dados ({@link Index#CONTENT}).
     */
    public Register9001(Index index) {
        this.index = index;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("9001")
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
