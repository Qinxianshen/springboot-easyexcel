package com.qin.springbooteasyexcel.domain;


/* author:Qinzijing
*  date: 2019/12/3
*  description:复杂对象详情
*/
public class Detail {
    private Integer id;
    private Integer keys;
    private String cnMark;
    private String enMark;
    private String type;
    private String lenght;
    private String unit;
    private String defaut;
    private String attributesExpression;
    private String datasource;
    private String datasourceText;
    private String algorithmExpression;
    private String function;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKeys() {
        return keys;
    }

    public void setKeys(Integer keys) {
        this.keys = keys;
    }

    public String getCnMark() {
        return cnMark;
    }

    public void setCnMark(String cnMark) {
        this.cnMark = cnMark;
    }

    public String getEnMark() {
        return enMark;
    }

    public void setEnMark(String enMark) {
        this.enMark = enMark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDefaut() {
        return defaut;
    }

    public void setDefaut(String defaut) {
        this.defaut = defaut;
    }

    public String getAttributesExpression() {
        return attributesExpression;
    }

    public void setAttributesExpression(String attributesExpression) {
        this.attributesExpression = attributesExpression;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getDatasourceText() {
        return datasourceText;
    }

    public void setDatasourceText(String datasourceText) {
        this.datasourceText = datasourceText;
    }

    public String getAlgorithmExpression() {
        return algorithmExpression;
    }

    public void setAlgorithmExpression(String algorithmExpression) {
        this.algorithmExpression = algorithmExpression;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
