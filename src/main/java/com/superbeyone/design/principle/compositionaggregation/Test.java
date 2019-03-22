package com.superbeyone.design.principle.compositionaggregation;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 合成复用原则
 * @date 2019-03-19 12:04
 **/

public class Test {
    public static void main(String[] args) {
        OperatorDao operatorDao = new OperatorDao();
        operatorDao.setDbConnection(new MySQLConnection());
        operatorDao.addProduct();
        System.out.println("------------------");
        operatorDao.setDbConnection(new OracleConnection());
        operatorDao.addProduct();
    }
}
