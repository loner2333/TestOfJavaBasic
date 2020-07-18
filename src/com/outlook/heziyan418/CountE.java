package com.outlook.heziyan418;

/**
 * 这个地方真的是算法重要，如果是先算阶乘，直接就Inf了
 */
public class CountE {
    public double countE(int n) {
        double sum = 1;
        double base = 1;
        for (int i = 1; i <= n; i++) {
            base /= i;
            sum += base;
        }
        return sum;
    }
}
