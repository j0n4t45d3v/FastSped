package org.fastsped.commons;

import org.fastsped.interfaces.RegisterFactory;

public class BlockUtil {

    public static byte[] generateBlock(RegisterFactory factory, String[] regs) {
        String block = factory.getRegisters(regs);
        return block.getBytes();
    }
}
