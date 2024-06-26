package org.fastsped.commons;

import org.fastsped.interfaces.Register;

import java.util.Arrays;
import java.util.Map;

/**
 * Classe utilitária para operações relacionadas a registros.
 *
 * <p>
 * Esta classe contém métodos estáticos para gerar registros, verificar a presença de registros em uma lista e adicionar contagem de registros em um mapa.
 * </p>
 */
public class RegisterUtil {

    /**
     * Gera o registro formatado a partir de um objeto Register.
     *
     * @param register O objeto Register a partir do qual o registro será gerado.
     * @return Uma string contendo o registro gerado.
     */
    public static String generateRegister(Register register) {
        return register.generateRegister();
    }

    /**
     * Verifica se um registro está presente em um array de registros válidos.
     *
     * @param registersValid O array de registros válidos.
     * @param register O registro a ser verificado.
     * @return true se o registro estiver presente na lista de registros válidos, false caso contrário.
     */
    public static boolean containRegister(String[] registersValid, String register) {
        return Arrays.asList(registersValid).contains(register);
    }

    /**
     * Adiciona a quantidade de ocorrências de um registro em um mapa.
     *
     * @param register O registro para adicionar ou atualizar a contagem.
     * @param quantityPerRegister O mapa que mantém a contagem de registros por tipo.
     */
    public static void addQuantityRegs(String register, Map<String, Integer>quantityPerRegister) {
        if(quantityPerRegister.containsKey(register)){
            quantityPerRegister.merge(register, 1, Integer::sum);
            return;
        }
        quantityPerRegister.put(register, 1);
    }
}
