package org.fastsped.blocks.efdIcmsIpi.registers.blockOne;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

/**
 * Implementação da interface {@link RegisterFactory} para geração dos registros do bloco 1 do EFD ICMS IPI.
 * Esta classe gera o registro 1001 e o registro 1990, que são os registros obrigatórios do bloco 1.
 */
public class OneRegister implements RegisterFactory {

    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    /**
     * Construtor da classe {@code OneRegister}.
     * Inicializa a quantidade de registros e o mapa de quantidade por registro.
     */
    public OneRegister() {
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegister1001(true));
        registersGenerated.append(this.closeRegister("1", this.quantity));
        RegisterUtil.addQuantityRegs("1990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }

    /**
     * Gera o registro 1001 do bloco 1 com base no índice indicando se o bloco está vazio ou não.
     *
     * @param blockIsEmpty Indica se o bloco está vazio (true) ou não (false).
     * @return Uma string contendo o registro 1001 gerado.
     */
    private String generateRegister1001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new Register1001(index);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("1001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
