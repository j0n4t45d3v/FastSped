package org.fastsped.interfaces;

import java.util.Map;

public interface Block {

    byte[] generateBlock();

    Map<String, Integer> getQuantityLines();

}
