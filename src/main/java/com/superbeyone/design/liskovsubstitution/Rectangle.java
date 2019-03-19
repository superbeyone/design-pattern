package com.superbeyone.design.liskovsubstitution;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Rectangle
 * @description 长方形
 * @date 2019-03-19 09:04
 **/

public class Rectangle implements Quadrangle {
    private long length;
    private long width;


    @Override
    public long getLength() {
        return length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
