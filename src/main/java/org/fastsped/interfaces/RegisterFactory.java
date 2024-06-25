package org.fastsped.interfaces;

import org.fastsped.commons.BuilderRegister;

public interface RegisterFactory {
    String getRegisters(String[] registers);

    default String closeRegister(String block, int quantity) {
        return BuilderRegister.builder(block+"990")
                .add(String.valueOf(quantity + 1))
                .build();
    }
}
