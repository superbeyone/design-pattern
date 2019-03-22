package com.superbeyone.design.principle.compositionaggregation;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className OracleConnection
 * @description
 * @date 2019-03-19 12:02
 **/

public class OracleConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "oracle建立连接";
    }
}
