package org.fastsped.model.data;

import java.math.BigDecimal;

/**
 * Representa os produtos presentes no EFD Fiscal
 */
public class Product {

    private String codItem;
    private String descrItem;
    private String codBarra;
    private String codAntItem;
    private String unidInv;
    private String tipoItem;
    private String codNcm;
    private String exIpi;
    private String codGen;
    private String codLst;
    private BigDecimal aliqIcms;
    private String cest;

    /**
     * Constrói uma instância do {@code Produtos} com os dados fornecidos.
     *
     * @param codItem Código do produto ou serviço
     * @param descrItem Descrição do Item
     * @param codBarra Código de barras do produto
     * @param codAntItem Código anterior do item
     * @param unidInv Código da unidade de medida tem relação com o campo {@code codUnid}
     * da classe {@link org.fastsped.model.data.Unit}
     * @param tipoItem Tipo do Item;
     * <p>valores validos: </p>
     * <ul>
     *  <li>00 – Mercadoria para Revenda;</li>
     *  <li>01 – Matéria-prima;</li>
     *  <li>02 – Embalagem;</li>
     *  <li>03 – Produto em Processo;</li>
     *  <li>04 – Produto Acabado;</li>
     *  <li>05 – Subproduto;</li>
     *  <li>06 – Produto Intermediário;</li>
     *  <li>07 – Material de Uso e Consumo;</li>
     *  <li>08 – Ativo Imobilizado;</li>
     *  <li>09 – Serviços;</li>
     *  <li>10 – Outros insumos;</li>
     *  <li>99 – Outras</li>
     *</ul>
     *
     * @param codNcm Código do ncm
     * @param exIpi Código Ex
     * @param codGen Código do gênero do item
     * @param codLst Código do serviço
     * @param aliqIcms Aliquota icms
     * @param cest Código Cest
     */
    public Product(
            String codItem, String descrItem, String codBarra, String codAntItem,
            String unidInv, String tipoItem, String codNcm, String exIpi, String codGen,
            String codLst, BigDecimal aliqIcms, String cest
    ) {
        this.codItem = codItem;
        this.descrItem = descrItem;
        this.codBarra = codBarra;
        this.codAntItem = codAntItem;
        this.unidInv = unidInv;
        this.tipoItem = tipoItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.codGen = codGen;
        this.codLst = codLst;
        this.aliqIcms = aliqIcms;
        this.cest = cest;
    }

    /**
     * Contrutor padrão da classe Produtos
     */
    public Product() {
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    public String getUnidInv() {
        return unidInv;
    }

    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public String getCodGen() {
        return codGen;
    }

    public void setCodGen(String codGen) {
        this.codGen = codGen;
    }

    public String getCodLst() {
        return codLst;
    }

    public void setCodLst(String codLst) {
        this.codLst = codLst;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }
}
