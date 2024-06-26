package org.fastsped.commons;

import org.fastsped.commons.enums.Index;

/**
 * Classe responsável por construir registros formatados para geração de arquivos.
 *
 * <p>
 * Esta classe oferece um construtor fluente para criar registros formatados, adicionando índices e valores aos registros.
 * </p>
 */
public class BuilderRegister {

    private final StringBuilder register;

    /**
     * Construtor privado para inicializar o construtor de registros com um valor inicial formatado.
     *
     * @param register O registro inicial formatado com delimitadores.
     */
    private BuilderRegister(String register) {
        this.register = new StringBuilder(register);
    }

    /**
     * Método estático para obter uma instância de BuilderRegister para construção de registros.
     *
     * @param register O valor inicial do registro a ser formatado.
     * @return Uma nova instância de BuilderRegister inicializada com o registro formatado.
     */
    public static BuilderRegister builder(String register) {
        String registerFormatted = String.format("|%s|",register);
        return new BuilderRegister(registerFormatted);
    }

    /**
     * Adiciona um índice ao registro atual.
     *
     * @param index O índice de movimento a ser adicionado ao registro.
     * @return Esta instância de BuilderRegister para permitir chamadas encadeadas.
     */
    public BuilderRegister add(Index index) {
        String indexToString = String.valueOf(index.getIndex());
        this.register.append(indexToString).append("|");
        return this;
    }

    /**
     * Adiciona um valor ao registro atual.
     *
     * @param value O valor a ser adicionado ao registro. Se for nulo, um valor vazio será adicionado.
     * @return Esta instância de BuilderRegister para permitir chamadas encadeadas.
     */
    public BuilderRegister add(String value) {
        if(value == null) {
            value = "";
        }
        this.register.append(value).append("|");
        return this;
    }

    /**
     * Constrói o registro formatado adicionando uma quebra de linha ao final.
     *
     * @return O registro completo como uma string formatada.
     */
    public String build() {
        return this.register.append("\n").toString();
    }

}
