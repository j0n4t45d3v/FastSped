package org.fastsped.commons;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitária para formatação de dados específicos do EFD (Escrituração Fiscal Digital).
 *
 * <p>
 * Esta classe contém métodos estáticos para formatação de datas e números BigDecimal conforme padrões específicos do EFD.
 * </p>
 */
public class EFDFormatter {

    /**
     * Formata uma data para o padrão utilizado no EFD (ddMMyyyy).
     *
     * @param date A data a ser formatada.
     * @return A data formatada como uma string no formato ddMMyyyy.
     */
    public static String date(Date date) {
        SimpleDateFormat pattern = new SimpleDateFormat("ddMMyyyy");
        return pattern.format(date);
    }

    /**
     * Formata um número BigDecimal para o padrão utilizado no EFD (0,00).
     *
     * <p>
     * O separador decimal é substituído de '.' para ',' conforme exigido pelo EFD.
     * </p>
     *
     * @param number O número BigDecimal a ser formatado.
     * @return O número formatado como uma string no formato 0,00.
     */
    public static String bigDecimal(BigDecimal number) {
        DecimalFormat pattern = new DecimalFormat("0,00");
        String numberFormatted = pattern.format(number);
        return numberFormatted.replace(".", ",");
    }

    /**
     * Formata o cst para o padrão aceito pelo EFD Fiscal.
     *
     * <p>
     * Caso o cst seja menor que o requerido será acrencentado zeros a esqueda até chegar ao tamanho requerido.
     * Mas se o cst for mais será truncado o valor passado pro cst.
     * </p>
     *
     * @param cst
     * @return O cst formatado como uma stringno formato 000
     */
    public static String cstIcms(String cst) {
        if(cst.length() > 3) {
            return cst.substring(0, 3);
        }
        return padLeftString(cst, "0", 3);
    }

    /**
     * Adiciona um preenchimento à esquerda de uma string até atingir um comprimento especificado.
     *
     * @param value A string original.
     * @param valuePad A string usada para preencher à esquerda.
     * @param length O comprimento total desejado após o preenchimento.
     * @return A string preenchida à esquerda com o valor especificado.
     */
    private static String padLeftString(String value, String valuePad, int length) {
        int difference = length - value.length();
        StringBuilder repeat = new StringBuilder();
        while(difference > 0) {
            repeat.append(valuePad);
            difference --;
        }
        return String.format("%s%s", repeat, value);
    }

}
