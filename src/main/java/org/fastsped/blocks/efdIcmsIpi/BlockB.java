package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockB.BRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

/**
 * Representa o Bloco B no arquivo EFD ICMS IPI.
 * Este bloco destina-se à escrituração e apuração do ISS (Imposto sobre Serviços).
 * <p>
 * Esta classe encapsula a lógica para gerar o Bloco B com base nos dados
 * fornecidos por uma instância específica de RegisterFactory.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * BlockB blockB = new BlockB();
 * byte[] blockBBytes = blockB.generateBlock();
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} constrói a estrutura de dados do Bloco B
 * e a retorna como um array de bytes. Ele utiliza uma RegisterFactory específica
 * para obter os dados necessários e o BlockUtil para formatar o bloco de acordo
 * com as especificações do EFD ICMS IPI.
 * </p>
 * <p>
 * O método {@code getQuantityLines} retorna informações sobre a quantidade de linhas
 * geradas dentro do Bloco B, o que pode ser útil para relatórios ou processamento adicional.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class BlockB implements Block {

    private Map<String, Integer> quantityPerRegister;

    /**
     * Constrói uma instância de BlockB.
     * Inicializa as variáveis necessárias para o processamento do bloco.
     */
    public BlockB() {
        this.quantityPerRegister = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new BRegister();
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
