package org.fastsped.commons;

import org.fastsped.interfaces.Register;

import java.util.Arrays;
import java.util.Map;

public class RegisterUtil {
    public static String generateRegister(Register register) {
        return register.generateRegister();
    }

    public static boolean containRegister(String[] registersValid, String register) {
        return Arrays.asList(registersValid).contains(register);
    }

    public static void addQuantityRegs(String register, Map<String, Integer>quantityPerRegister) {
        if(quantityPerRegister.containsKey(register)){
            quantityPerRegister.merge(register, 1, Integer::sum);
            return;
        }
        quantityPerRegister.put(register, 1);
    }
}
