package org.fastsped.blocks.efdIcmsIpi.registers.blockG;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

/**
 * Classe responsável pela geração dos registros do bloco G do EFD ICMS IPI.
 * Implementa a interface {@link RegisterFactory} para definir métodos de geração de registros e controle de quantidades.
 */
public class GRegister implements RegisterFactory {

    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    /**
     * Construtor que inicializa a classe com os contadores de quantidade de registros.
     */
    public GRegister() {
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterG001(true));
        registersGenerated.append(this.closeRegister("G", this.quantity));
        RegisterUtil.addQuantityRegs("G990", this.quantityPerRegister);
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
     * Gera o registro G001 com base no índice indicando se o bloco está vazio ou não.
     *
     * @param blockIsEmpty Indica se o bloco está vazio (true) ou não (false).
     * @return Uma string contendo o registro G001 gerado.
     */
    private String generateRegisterG001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT : CONTENT;
        Register register = new RegisterG001(index);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("G001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
