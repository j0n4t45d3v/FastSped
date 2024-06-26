package org.fastsped.interfaces;

import org.fastsped.commons.BuilderRegister;

import java.util.Map;

/**
 * Interface que define um contrato para a fábrica responsável pela geração de registros necessários para um bloco.
 *
 * <p>
 * Esta interface define métodos para obter os registros gerados como uma string formatada, fechar o bloco de registros com informações adicionais
 * e obter um mapa que contém a quantidade de cada tipo de registro.
 * </p>
 */
public interface RegisterFactory {

    /**
     * Obtém os registros formatados como uma string a partir de um array de registros.
     *
     * @param registers O array de registros a serem formatados.
     * @return Uma string contendo os registros formatados.
     */
    String getRegisters(String[] registers);

    /**
     * Obtém um mapa que contém a quantidade de cada tipo de registro presente.
     *
     * @return Um mapa contendo o nome do registro como chave e a quantidade como valor.
     */
    Map<String, Integer> getQuantityPerRegister();

    /**
     * Fecha o bloco de registros adicionando informações adicionais, como o registro 990.
     *
     * @param block    O bloco de registros a ser fechado.
     * @param quantity A quantidade total de registros no bloco.
     * @return Uma string contendo o bloco de registros fechado com informações adicionais.
     */
    default String closeRegister(String block, int quantity) {
        return BuilderRegister.builder(block+"990")
                .add(String.valueOf(quantity + 1))
                .build();
    }

}
