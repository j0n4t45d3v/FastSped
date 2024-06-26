package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.commons.BuilderRegister;
import org.fastsped.interfaces.Register;
import org.fastsped.model.data.Unit;

/**
 * Implementação da interface {@link Register} para o registro 0000 do Bloco 0 do EFD ICMS IPI.
 * Este registro contém informações das unidades de medida do arquivo EFD ICMS IPI.
 */
public class Register0190 implements Register {

    private Unit unit;

    /**
     * Construtor da classe {@code Register0190}.
     *
     * @param unit Objeto {@link Unit} contendo os dados das unidades de medida do EFD ICMS IPI.
     */
    public Register0190(Unit unit) {
        this.unit = unit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateRegister() {

        return BuilderRegister.builder("0190")
                .add(this.unit.getUnid()).add(this.unit.getDescr())
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getQuantityLines() {
        return 1;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}