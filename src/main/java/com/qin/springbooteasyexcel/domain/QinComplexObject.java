package com.qin.springbooteasyexcel.domain;


import com.alibaba.excel.annotation.ExcelProperty;


import java.util.List;

/* author:Qinzijing
*  date: 2019/12/2
*  description:新版本下的实体类写法 组合
*/
public class QinComplexObject {
    private String modelCnName;
    private String modelEnName;
    private String modelNumber;
    private String modelStuff;
    private String devStuff;
    private String modelState;
    private String mintime;
    private String minspace;
    private String requiretime;
    private String onlyexpression;
    private String mainIndex;
    private String modelLevel;
    private String modelexpression;
    /*
    * 以下是组合
    * */
    private DepenceModel depenceModel;
    private List<Detail> details;
    private StoageDatabase stoageDatabase;

    public DepenceModel getDepenceModel() {
        return depenceModel;
    }

    public void setDepenceModel(DepenceModel depenceModel) {
        this.depenceModel = depenceModel;
    }

    public StoageDatabase getStoageDatabase() {
        return stoageDatabase;
    }

    public void setStoageDatabase(StoageDatabase stoageDatabase) {
        this.stoageDatabase = stoageDatabase;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

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
}
