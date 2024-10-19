package org.fastsped.model.data;

public class Unit {

    private String unid;
    private String descr;

    public Unit(String unid, String descr) {
        this.unid = unid;
        this.descr = descr;
    }

    public Unit() {
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
