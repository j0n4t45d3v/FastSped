package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockK.KRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

/**
 * Representa o Bloco K no arquivo EFD ICMS IPI.
 * Este bloco se destina a prestar informações mensais da produção e respectivo consumo de insumos,
 * bem como do estoque escriturado, relativos aos estabelecimentos industriais ou a eles equiparados pela legislação federal
 * e pelos atacadistas, podendo, a critério do Fisco, ser exigido de estabelecimento de contribuintes de outros setores
 * (conforme § 4º do art. 63 do Convênio s/número, de 1970).
 * <p>
 * Esta classe encapsula a lógica para gerar o Bloco K com base nos dados
 * fornecidos por uma instância específica de RegisterFactory.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * BlockK blockK = new BlockK();
 * byte[] blockKBytes = blockK.generateBlock();
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} constrói a estrutura de dados do Bloco K
 * e a retorna como um array de bytes. Ele utiliza uma RegisterFactory específica
 * para obter os dados necessários e o BlockUtil para formatar o bloco de acordo
 * com as especificações do EFD ICMS IPI.
 * </p>
 * <p>
 * O método {@code getQuantityLines} retorna informações sobre a quantidade de linhas
 * geradas dentro do Bloco K, o que pode ser útil para relatórios ou processamento adicional.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class BlockK implements Block {
    private Map<String, Integer> quantityPerRegister;

    /**
     * Constrói uma instância de BlockK.
     * Inicializa as variáveis necessárias para o processamento do bloco.
     */
    public BlockK() {
        this.quantityPerRegister = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new KRegister();
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
