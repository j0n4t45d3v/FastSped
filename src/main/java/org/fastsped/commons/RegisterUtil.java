package org.fastsped.commons;

import org.fastsped.interfaces.Register;

import java.util.List;

public class RegisterUtil {
    public static String generateRegister(Register register) {
        return register.generateRegister();
    }

    public static boolean containRegister(String[] registersValid, String register) {
        return List.of(registersValid).contains(register);
    }
}
