package com.superbeyone.design;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className GreatestDivisor
 * @description 求最大公约数 （辗转相除法--欧几里得算法）
 * @date 2019-09-16 09:17
 **/

public class GreatestDivisor {

    private static int getGreatestCommonDivisor(int a, int b) {
        int big = Math.max(a, b);
        int small = Math.min(a, b);

        if (big % small == 0) {
            return small;
        }

        return getGreatestCommonDivisor(big % small, small);
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 5));
        System.out.println(getGreatestCommonDivisor(10000, 1001));
        System.out.println(getGreatestCommonDivisor(21, 14));

    }

    /**
     * 更相减损术 （九章算术）
     *
     * @param a a
     * @param b b
     * @return 最大公约数
     */
    private static int getGreatestCommonDivisorV2(int a, int b) {
        if (a == b) {
            return a;
        }
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        return getGreatestCommonDivisorV2(big - small, small);
    }

    /**
     * 更相减损术 + 移位
     */
    private static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }

        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd(a >> 1, b >> 1) << 1;
        } else if ((a & 1) == 0 && (b & 1) != 0) {
            return gcd(a >> 1, b);
        } else if ((a & 1) != 0 && (b & 1) == 0) {
            return gcd(a, b >> 1);
        } else {
            int big = Math.max(a, b);
            int small = Math.min(a, b);
            return gcd(big - small, small);
        }
    }
}
