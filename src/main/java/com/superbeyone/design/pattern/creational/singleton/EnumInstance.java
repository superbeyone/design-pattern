package com.superbeyone.design.pattern.creational.singleton;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className EnumInstance
 * @description 枚举方式
 * @date 2019-05-15 15:14
 **/

public enum EnumInstance {
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("print test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
