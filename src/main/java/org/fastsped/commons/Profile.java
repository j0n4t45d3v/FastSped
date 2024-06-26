package org.fastsped.commons;

/**
 * Enumeração que representa os perfis de empresa em um arquivo.
 *
 * <p>
 * Este enum define três perfis:
 * <ul>
 * <li>{@link #A} - Perfil A.</li>
 * <li>{@link #B} - Perfil B.</li>
 * <li>{@link #C} - Perfil C.</li>
 * </ul>
 * </p>
 *
 * <p>
 * Cada perfil é representado por uma letra maiúscula ('A', 'B', ou 'C'), indicando
 * o perfil da empresa ao qual o arquivo está relacionado.
 * </p>
 */
public enum Profile {
    /**
     * Perfil A.
     */
    A("A"),
    /**
     * Perfil B.
     */
    B("B"),
    /**
     * Perfil C.
     */
    C("C");

    private final String profile;

    /**
     * Construtor privado do enum Profile.
     *
     * @param profile O perfil da empresa representado por uma letra ('A', 'B' ou 'C').
     */
    Profile(String profile) {
        this.profile = profile;
    }

    /**
     * Obtém o perfil da empresa como uma string.
     *
     * @return A representação do perfil da empresa.
     */
    public String getProfile() {
        return profile;
    }
}
