package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockD.DRegister;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Map;

/**
 * Representa o Bloco D no arquivo EFD ICMS IPI.
 * Este bloco destina-se aos registros dos dados relativos à emissão ou ao recebimento
 * de documentos fiscais que acobertam as prestações de serviços de comunicação,
 * transporte intermunicipal e interestadual.
 * <p>
 * Esta classe encapsula a lógica para gerar o Bloco D com base nos dados
 * fornecidos por uma instância específica de RegisterFactory.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * BlockD blockD = new BlockD();
 * byte[] blockDBytes = blockD.generateBlock();
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} constrói a estrutura de dados do Bloco D
 * e a retorna como um array de bytes. Ele utiliza uma RegisterFactory específica
 * para obter os dados necessários e o BlockUtil para formatar o bloco de acordo
 * com as especificações do EFD ICMS IPI.
 * </p>
 * <p>
 * O método {@code getQuantityLines} retorna informações sobre a quantidade de linhas
 * geradas dentro do Bloco D, o que pode ser útil para relatórios ou processamento adicional.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class BlockD implements Block {

    private Map<String, Integer> quantityPerRegister;

    /**
     * Constrói uma instância de BlockD.
     * Inicializa as variáveis necessárias para o processamento do bloco.
     */
    public BlockD() {
        this.quantityPerRegister = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new DRegister();
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
