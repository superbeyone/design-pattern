package com.superbeyone.design.compositionaggregation;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className OperatorDao
 * @description
 * @date 2019-03-19 12:03
 **/

public class OperatorDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        System.out.println("使用" + dbConnection.getConnection() + "添加商品信息");
    }
}
