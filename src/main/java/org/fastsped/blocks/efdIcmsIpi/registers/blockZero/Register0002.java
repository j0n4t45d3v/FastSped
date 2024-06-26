package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.interfaces.Register;
import org.fastsped.commons.BuilderRegister;

/**
 * Implementação da interface {@link Register} para o registro 0002 do Bloco 0 do EFD ICMS IPI.
 * Este registro contém informações sobre a classificação do estabelecimento industrial.
 */
public class Register0002 implements Register {

    private String clasEstabInd;

    /**
     * Construtor da classe {@code Register0002}.
     *
     * @param clasEstabInd Classificação do estabelecimento industrial
     */
    public Register0002(String clasEstabInd) {
        this.clasEstabInd = clasEstabInd;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {
        return BuilderRegister.builder("0002")
                .add(this.clasEstabInd)
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getQuantityLines() {
        return 1;
    }

    public String getClasEstabInd() {
        return clasEstabInd;
    }

    public void setClasEstabInd(String clasEstabInd) {
        this.clasEstabInd = clasEstabInd;
    }
}
