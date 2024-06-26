package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockG.GRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

/**
 * Representa o Bloco G no arquivo EFD ICMS IPI.
 * Este bloco destina-se ao controle do crédito de ICMS do Ativo Permanente (CIAP),
 * demonstrando o cálculo da parcela do crédito de ICMS apropriada no mês, decorrente da entrada
 * de mercadorias destinadas ao ativo imobilizado, conforme previsto no art. 20, § 5º, da Lei Complementar
 * nº 87, de 13 de setembro de 1996.
 * <p>
 * Esta classe encapsula a lógica para gerar o Bloco G com base nos dados
 * fornecidos por uma instância específica de RegisterFactory.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * BlockG blockG = new BlockG();
 * byte[] blockGBytes = blockG.generateBlock();
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} constrói a estrutura de dados do Bloco G
 * e a retorna como um array de bytes. Ele utiliza uma RegisterFactory específica
 * para obter os dados necessários e o BlockUtil para formatar o bloco de acordo
 * com as especificações do EFD ICMS IPI.
 * </p>
 * <p>
 * O método {@code getQuantityLines} retorna informações sobre a quantidade de linhas
 * geradas dentro do Bloco G, o que pode ser útil para relatórios ou processamento adicional.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class BlockG implements Block {

    private Map<String, Integer> quantityPerRegister;

    /**
     * Constrói uma instância de BlockG.
     * Inicializa as variáveis necessárias para o processamento do bloco.
     */
    public BlockG() {
        this.quantityPerRegister = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new GRegister();
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
