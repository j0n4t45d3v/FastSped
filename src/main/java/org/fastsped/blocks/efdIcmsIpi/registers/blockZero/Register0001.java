package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.interfaces.Register;
import org.fastsped.commons.BuilderRegister;
import org.fastsped.commons.enums.Index;

/**
 * Implementação da interface {@link Register} para o registro 0001 do Bloco 0 do EFD ICMS IPI.
 * Este registro contém informações sobre indicadores de movimento do arquivo.
 */
public class Register0001 implements Register {

    private final Index index;

    /**
     * Construtor da classe {@code Register0001}.
     *
     * @param index Índice de conteúdo do registro
     */
    public Register0001(Index index) {
        this.index = index;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("0001")
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
