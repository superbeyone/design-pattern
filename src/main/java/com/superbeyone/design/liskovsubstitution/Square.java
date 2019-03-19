package com.superbeyone.design.liskovsubstitution;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Square
 * @description 正方形
 * @date 2019-03-19 09:05
 **/

public class Square implements Quadrangle {
    private long sideLength;

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
