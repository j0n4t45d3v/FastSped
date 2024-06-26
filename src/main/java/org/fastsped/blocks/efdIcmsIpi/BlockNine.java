package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockNine.NineRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

/**
 * Representa o Bloco Nove no arquivo EFD ICMS IPI.
 * Este bloco representa os totais de registros e serve como forma de controle para batimentos e verificações.
 * <p>
 * Esta classe encapsula a lógica para gerar o Bloco Nove com base nos dados
 * fornecidos por uma instância específica de RegisterFactory.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * // Configurar a quantidade de registros antes de gerar o bloco
 * BlockNine blockNine = new BlockNine();
 * blockNine.setQuantityRegs(quantityRegs);
 * byte[] blockNineBytes = blockNine.generateBlock();
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} constrói a estrutura de dados do Bloco Nove
 * e a retorna como um array de bytes. Ele utiliza uma RegisterFactory específica
 * para obter os dados necessários e o BlockUtil para formatar o bloco de acordo
 * com as especificações do EFD ICMS IPI.
 * </p>
 * <p>
 * O método {@code setQuantityRegs} permite configurar a quantidade de registros
 * antes de gerar o bloco, o que é essencial para garantir a precisão dos totais
 * de registros no arquivo digital.
 * </p>
 * <p>
 * Como este bloco representa o controle e encerramento do arquivo digital, ele não
 * implementa o método {@code getQuantityLines}, retornando sempre {@code null}.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class BlockNine implements Block {

    private Map<String, Integer> quantityRegs;

    /**
     * Constrói uma instância de BlockNine.
     * Inicializa as variáveis necessárias para o processamento do bloco.
     */
    public BlockNine() {
        this.quantityRegs = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new NineRegister(quantityRegs);
        String[] regs = {};
        return BlockUtil.generateBlock(factory, regs);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Integer> getQuantityLines() {
        return null;
    }

    /**
     * Este método permite configurar a quantidade de registros antes de gerar o bloco.
     *
     * @param quantityRegs Mapa contendo a quantidade de registros por tipo.
     */
    public void setQuantityRegs(Map<String, Integer> quantityRegs) {
        this.quantityRegs = quantityRegs;
    }
}
