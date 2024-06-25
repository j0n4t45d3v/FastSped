package org.fastsped.commons;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EFDFormatter {
    public static String date(Date date) {
        SimpleDateFormat pattern = new SimpleDateFormat("ddMMyyyy");
        return pattern.format(date);
    }

    public static String bigDecimal(BigDecimal number) {
        DecimalFormat pattern = new DecimalFormat("0,00");
        String numberFormatted = pattern.format(number);
        return numberFormatted.replace(".", ",");
    }
}
