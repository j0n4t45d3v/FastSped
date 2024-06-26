package org.fastsped.blocks.efdIcmsIpi.registers.blockB;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;
import org.fastsped.interfaces.Register;

/**
 * Implementação da interface {@link Register} para o registro B001 do EFD ICMS IPI.
 * Este registro representa um registro específico dentro do bloco B.
 */
public class RegisterB001 implements Register {

    private final Index index;

    /**
     * Construtor da classe {@code RegisterB001}.
     *
     * @param index Índice que indica se o bloco está vazio ({@link Index#NOT_CONTENT}) ou contém informações ({@link Index#CONTENT}).
     */
    public RegisterB001(Index index) {
        this.index = index;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("B001")
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
