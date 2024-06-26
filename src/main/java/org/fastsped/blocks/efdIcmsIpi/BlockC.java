package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockC.CRegisters;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.model.EfdIcmsIpi;

import java.util.Map;

/**
 * Representa o Bloco C no arquivo EFD ICMS IPI.
 * Este bloco destina-se aos registros dos dados relativos à emissão ou ao recebimento
 * de documentos fiscais que acobertam as operações com mercadorias, envolvendo ICMS e IPI.
 * <p>
 * Esta classe encapsula a lógica para gerar o Bloco C com base nos dados fornecidos
 * por uma instância específica de CRegisters.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * // Exemplo de criação de um objeto BlockC
 * EfdIcmsIpi efdIcmsIpi = new EfdIcmsIpi(); // Exemplo de criação de um objeto EfdIcmsIpi
 * BlockC blockC = new BlockC(efdIcmsIpi);
 * byte[] blockCBytes = blockC.generateBlock();
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} constrói a estrutura de dados do Bloco C
 * e a retorna como um array de bytes. Ele utiliza uma CRegisters específica
 * para obter os dados necessários e o BlockUtil para formatar o bloco de acordo
 * com as especificações do EFD ICMS IPI.
 * </p>
 * <p>
 * O método {@code getQuantityLines} retorna informações sobre a quantidade de linhas
 * geradas dentro do Bloco C, o que pode ser útil para relatórios ou processamento adicional.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class BlockC implements Block {

    private final EfdIcmsIpi efdIcmsIpi;
    private Map<String, Integer> quantityPerRegister;

    /**
     * Constrói uma instância de BlockC com os dados do EFD ICMS IPI fornecidos.
     * @param efdIcmsIpi Objeto que contém todos os dados necessários para gerar o EFD ICMS IPI.
     */
    public BlockC(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantityPerRegister = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateBlock() {
        CRegisters factory = new CRegisters(this.efdIcmsIpi);
        this.quantityPerRegister = factory.getQuantityPerRegister();
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Integer> getQuantityLines() {
        return this.quantityPerRegister;
    }
}
