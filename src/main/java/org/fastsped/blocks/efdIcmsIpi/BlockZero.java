package org.fastsped.blocks.efdIcmsIpi;

import org.fastsped.blocks.efdIcmsIpi.registers.blockZero.ZeroRegisters;
import org.fastsped.commons.BlockUtil;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;

import java.util.Map;

/**
 * Representa o Bloco Zero no arquivo EFD ICMS IPI.
 * Este bloco é responsável por gerar o cabeçalho do arquivo.
 * O Bloco Zero é o primeiro bloco na estrutura do EFD ICMS IPI.
 * <p>
 * Esta classe encapsula a lógica para gerar o Bloco Zero com base nos dados
 * fornecidos por uma instância de EfdIcmsIpi.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * EfdIcmsIpi efdData = new EfdIcmsIpi(); // Preencha efdData com as informações necessárias
 * BlockZero blockZero = new BlockZero(efdData);
 * byte[] blockZeroBytes = blockZero.generateBlock();
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} constrói a estrutura de dados do Bloco Zero
 * e a retorna como um array de bytes. Ele utiliza uma RegisterFactory para obter
 * os dados necessários do EfdIcmsIpi e o BlockUtil para formatar o bloco de acordo
 * com as especificações do EFD ICMS IPI.
 * </p>
 * <p>
 * O método {@code getQuantityLines} fornece informações sobre a quantidade de linhas
 * geradas dentro do Bloco Zero, o que é útil para relatórios e processamento geral do arquivo.
 * </p>
 * <p>
 * É essencial que o objeto EfdIcmsIpi passado para esta classe esteja corretamente preenchido
 * com todos os dados necessários conforme a documentação do EFD ICMS IPI, para garantir a correta
 * geração do Bloco Zero.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @autor Jonatas
 */
public class BlockZero implements Block {

    private final EfdIcmsIpi efdIcmsIpi;
    private Map<String, Integer> quantityPerRegister;

    /**
     * Constrói uma instância de BlockZero com os dados fornecidos pelo EfdIcmsIpi.
     *
     * @param efdIcmsIpi Objeto que contém todos os dados necessários para gerar o EFD ICMS IPI.
     */
    public BlockZero(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantityPerRegister = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateBlock() {
        RegisterFactory factory = new ZeroRegisters(this.efdIcmsIpi);
        this.quantityPerRegister = factory.getQuantityPerRegister();
        String[] regs = {"0002"};
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
