package com.outlook.heziyan418;

/**
 * 题意理解错了，忽略吧
 */
public class Q5457Solution {

    public int numOfSubarrays(int[] arr) {
        int length = arr.length;
        int odd = 0;
        int even = 0;
        int module = 1_000_000_000 + 7;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (odd == 0) {
            return 0;
        }
        if (even == 0) {
            long sum = 0;
            for (int i = 1; 2 * i - 1 <= odd; i++) {
                sum += combine(odd, 2 * i - 1);
            }
            return (int) (sum % module);
        }

        long sum = 0;
        for (int i = 1; 2 * i - 1 <= odd; i++) {
            for (int j = 1; j <= even; j++) {
                if (length - 2 * i + 1 > j) {
                    sum += combine(length, 2 * i - 1) * combine(odd, 2 * i - 1) * combine(j,
                        length - 2 * i + 1);
                }
            }
        }
        return (int) (sum % module);

    }

    private long combine(int a, int b) {
        if (a > b) {
            long lambda = 1;
            for (int i = a - b + 1; i <= a; i++) {
                lambda *= i;
            }
            for (int i = 1; i <= b; i++) {
                lambda /= i;
            }
            return lambda;
        } else {
            return 1;
        }
    }
}
