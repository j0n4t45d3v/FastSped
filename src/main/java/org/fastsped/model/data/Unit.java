package org.fastsped.model.data;

/**
 *  Representa as unidades de medida dos produtos presentes na escrituração.
 */
public class Unit {

    private String unid;
    private String descr;

    /**
     * Constrói uma instância do {@code Unit} com os dados fornecidos.
     * @param unid É o código da unidade de medida
     * @param descr É o nome da unidade de medida
     */
    public Unit(String unid, String descr) {
        this.unid = unid;
        this.descr = descr;
    }

    /**
     * Construtor padrão da classe {@code Unit}
     */
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
