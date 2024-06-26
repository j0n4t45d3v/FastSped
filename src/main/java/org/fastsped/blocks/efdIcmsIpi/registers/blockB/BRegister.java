package org.fastsped.blocks.efdIcmsIpi.registers.blockB;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

/**
 * Classe responsável pela geração dos registros do bloco B do EFD ICMS IPI.
 * Implementa a interface {@link RegisterFactory} para definir métodos de geração de registros e controle de quantidades.
 */
public class BRegister implements RegisterFactory {

    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    /**
     * Construtor padrão que inicializa a quantidade de registros e o mapa de quantidades por tipo de registro.
     */
    public BRegister() {
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterB001(true));
        registersGenerated.append(this.closeRegister("B", this.quantity));
        RegisterUtil.addQuantityRegs("B990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    /**
     * Gera o registro B001 com base no índice indicando se o bloco está vazio ou não.
     *
     * @param blockIsEmpty Indica se o bloco está vazio (true) ou não (false).
     * @return Uma string contendo o registro B001 gerado.
     */
    private String generateRegisterB001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new RegisterB001(index);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("B001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }
}
