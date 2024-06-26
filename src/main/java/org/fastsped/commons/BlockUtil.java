package org.fastsped.commons;

import org.fastsped.interfaces.RegisterFactory;

/**
 * Classe utilitária para geração de blocos de registros.
 *
 * <p>
 * Esta classe fornece métodos estáticos para gerar blocos de registros utilizando uma fábrica de registros específica.
 * </p>
 */
public class BlockUtil {

    /**
     * Gera um bloco de registros a partir de uma fábrica de registros e uma lista de códigos de registros.
     *
     * @param factory A fábrica de registros utilizada para criar o bloco.
     * @param regs    Um array contendo os códigos dos registros que compõem o bloco.
     * @return Um array de bytes representando o bloco de registros gerado.
     */
    public static byte[] generateBlock(RegisterFactory factory, String[] regs) {
        String block = factory.getRegisters(regs);
        return block.getBytes();
    }
}
