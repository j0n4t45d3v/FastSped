package org.fastsped.commons;

import org.fastsped.commons.enums.Index;

public class BuilderRegister {

    private final StringBuilder register;

    private BuilderRegister(String register) {
        this.register = new StringBuilder(register);
    }

    public static BuilderRegister builder(String register) {
        String registerFormatted = String.format("|%s|",register);
        return new BuilderRegister(registerFormatted);
    }

    public BuilderRegister add(Index index) {
        String indexToString = String.valueOf(index.getIndex());
        this.register.append(indexToString).append("|");
        return this;
    }

    public BuilderRegister add(String value) {
        if(value == null) {
            value = "";
        }
        this.register.append(value).append("|");
        return this;
    }

    public String build() {
        return this.register.append("\n").toString();
    }

}
