package org.fastsped.commons;

public enum Index {
    CONTENT(0), NOT_CONTENT(1);

    private final int index;

    Index(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
