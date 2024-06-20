package org.fastsped.util;

public enum Profile {
    A("A"), B("B"), C("C");

    private String profile;

    Profile(String profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }
}
