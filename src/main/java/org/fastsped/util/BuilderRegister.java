package org.fastsped.util;

public class BuilderRegister {
    private final StringBuilder register;

    private BuilderRegister(String register) {
        this.register = new StringBuilder(register);
    }

    public static BuilderRegister builder(String register) {
        String registerFormatted = String.format("|%s|",register);
        return new BuilderRegister(registerFormatted);
    }

    public BuilderRegister add(String value) {
        this.register.append(value).append("|");
        return this;
    }

    public String build() {
        return this.register.append("\n").toString();
    }

}
