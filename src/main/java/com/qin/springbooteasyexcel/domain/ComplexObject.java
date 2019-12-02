package com.qin.springbooteasyexcel.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/* author:Qinzijing
*  date: 2019/12/2
*  description:复杂对象 设计
*/
public class ComplexObject extends BaseRowModel {
    @ExcelProperty(value = {"模型中文名","模型中文名"})
    private String modelCnName;
    @ExcelProperty(value = {"模型英文名","模型英文名"})
    private String modelEnName;
    @ExcelProperty(value = {"模型编号","模型编号"})
    private String modelNumber;
    @ExcelProperty(value = {"建模人员","建模人员"})
    private String modelStuff;
    @ExcelProperty(value = {"开发人员","开发人员"})
    private String devStuff;
    @ExcelProperty(value = {"模型状态","模型状态"})
    private String modelState;
    @ExcelProperty(value = {"最小时间粒度","最小时间粒度"})
    private String mintime;
    @ExcelProperty(value = {"最小空间粒度","最小空间粒度"})
    private String minspace;
    @ExcelProperty(value = {"时延要求","时延要求"})
    private String requiretime;
    @ExcelProperty(value = {"唯一性说明","唯一性说明"})
    private String onlyexpression;
    @ExcelProperty(value = {"分区以及主索引","分区以及主索引"})
    private String mainIndex;
    @ExcelProperty(value = {"模型层次","模型层次"})
    private String modelLevel;
    @ExcelProperty(value = {"模型描述","模型描述"})
    private String modelexpression;
    @ExcelProperty(value = {"依赖模型","依赖模型"})
    private String modeldependance;
    @ExcelProperty(value = {"详情","序号"})
    private Integer id;
    @ExcelProperty(value = {"详情","主键"})
    private Integer keys;
    @ExcelProperty(value = {"详情","字段中文标识"})
    private String cnMark;
    @ExcelProperty(value = {"详情","字段英文标识"})
    private String enMark;
    @ExcelProperty(value = {"详情","类型"})
    private String type;
    @ExcelProperty(value = {"详情","长度"})
    private String lenght;
    @ExcelProperty(value = {"详情","单位"})
    private String unit;
    @ExcelProperty(value = {"详情","默认值"})
    private String defaut;
    @ExcelProperty(value = {"详情","属性描述"})
    private String attributesExpression;
    @ExcelProperty(value = {"详情","对应数据源表"})
    private String datasource;
    @ExcelProperty(value = {"详情","对应数据源表字段"})
    private String datasourceText;
    @ExcelProperty(value = {"详情","算法描述"})
    private String algorithmExpression;
    @ExcelProperty(value = {"详情","函数"})
    private String function;
    @ExcelProperty(value = {"储存介质","数据库"})
    private String database;
    @ExcelProperty(value = {"储存介质","库名"})
    private String databaseName;
    @ExcelProperty(value = {"储存介质","存储周期"})
    private String storageCycle;

    public String getModelCnName() {
        return modelCnName;
    }

    public void setModelCnName(String modelCnName) {
        this.modelCnName = modelCnName;
    }

    public String getModelEnName() {
        return modelEnName;
    }

    public void setModelEnName(String modelEnName) {
        this.modelEnName = modelEnName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelStuff() {
        return modelStuff;
    }

    public void setModelStuff(String modelStuff) {
        this.modelStuff = modelStuff;
    }

    public String getDevStuff() {
        return devStuff;
    }

    public void setDevStuff(String devStuff) {
        this.devStuff = devStuff;
    }

    public String getModelState() {
        return modelState;
    }

    public void setModelState(String modelState) {
        this.modelState = modelState;
    }

    public String getMintime() {
        return mintime;
    }

    public void setMintime(String mintime) {
        this.mintime = mintime;
    }

    public String getMinspace() {
        return minspace;
    }

    public void setMinspace(String minspace) {
        this.minspace = minspace;
    }

    public String getRequiretime() {
        return requiretime;
    }

    public void setRequiretime(String requiretime) {
        this.requiretime = requiretime;
    }

    public String getOnlyexpression() {
        return onlyexpression;
    }

    public void setOnlyexpression(String onlyexpression) {
        this.onlyexpression = onlyexpression;
    }

    public String getMainIndex() {
        return mainIndex;
    }

    public void setMainIndex(String mainIndex) {
        this.mainIndex = mainIndex;
    }

    public String getModelLevel() {
        return modelLevel;
    }

    public void setModelLevel(String modelLevel) {
        this.modelLevel = modelLevel;
    }

    public String getModelexpression() {
        return modelexpression;
    }

    public void setModelexpression(String modelexpression) {
        this.modelexpression = modelexpression;
    }

    public String getModeldependance() {
        return modeldependance;
    }

    public void setModeldependance(String modeldependance) {
        this.modeldependance = modeldependance;
    }

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

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getStorageCycle() {
        return storageCycle;
    }

    public void setStorageCycle(String storageCycle) {
        this.storageCycle = storageCycle;
    }
}
