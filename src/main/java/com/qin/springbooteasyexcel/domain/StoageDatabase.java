package com.qin.springbooteasyexcel.domain;

/* author:Qinzijing
*  date: 2019/12/3
*  description:存储介质
*/
public class StoageDatabase {
    private String database;
    private String databaseName;
    private String storageCycle;

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
