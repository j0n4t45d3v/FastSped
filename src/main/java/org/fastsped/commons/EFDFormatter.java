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
        DecimalFormat pattern = new DecimalFormat("0.00");
        String numberFormatted = pattern.format(number);
        return numberFormatted.replace(".", ",");
    }

    public static String cleanString(String value) {
        return value.trim()
                .replace(".", "")
                .replace("-", "")
                .replace("/", "")
                .replace(",", "");
    }

    public static String cstIcms(String cst) {
        if(cst.length() > 3) {
            return cst.substring(0, 3);
        }
        return padLeftString(cst, "0", 3);
    }

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
