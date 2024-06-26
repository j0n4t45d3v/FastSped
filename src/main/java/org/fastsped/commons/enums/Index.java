package org.fastsped.commons.enums;

/**
 * Enumeração que representa o índice de conteúdo de um bloco.
 *
 * <p>
 * Este enum define dois valores:
 * <ul>
 * <li>{@link #CONTENT} - Índice 0, indicando que o bloco possui conteúdo.</li>
 * <li>{@link #NOT_CONTENT} - Índice 1, indicando que o bloco não possui conteúdo.</li>
 * </ul>
 * </p>
 *
 * <p>
 * Este enum é utilizado para determinar se um bloco possui ou não conteúdo,
 * facilitando a geração ou interpretação de estruturas como o SPED (Sistema
 * Público de Escrituração Digital).
 * </p>
 */
public enum Index {
    /**
     * Índice 0 - Indica que o bloco possui conteúdo.
     */
    CONTENT(0),
    /**
     * Índice 1 - Indica que o bloco não possui conteúdo.
     */
    NOT_CONTENT(1);

    private final int index;

    /**
     * Construtor privado do enum Index.
     *
     * @param index O índice associado ao tipo de conteúdo do bloco.
     */
    Index(int index) {
        this.index = index;
    }

    /**
     * Obtém o índice associado ao tipo de conteúdo do bloco.
     *
     * @return O índice inteiro representando se o bloco possui ou não conteúdo.
     */
    public int getIndex() {
        return index;
    }
}
