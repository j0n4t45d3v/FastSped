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

}
