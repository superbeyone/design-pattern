package com.superbeyone.design.compositionaggregation;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className MySQLConnection
 * @description
 * @date 2019-03-19 12:00
 **/

public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "mysql建立连接";
    }
}
