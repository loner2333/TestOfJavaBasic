package com.outlook.heziyan418;

/**
 * 4.23
 */
public class OrderDifference {
    public void orderDifference() {
        double sum = 0;
        int n = 50_000;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("from left to right: " + sum);
        sum = 0;
        for (int i = n; i >= 1; i--) {
            sum += 1.0 / i;
        }
        System.out.println("from right to left: " + sum);
    }
}
