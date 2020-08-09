package com.outlook.heziyan418;

/**
 * 4.33
 * 数组申请空间的时候，还是可以细抠一下；换成List也好一些
 * 完全数是“其他所有除数的和"，和阶乘无关
 */
public class FindWholeNum {

    public void findWholeNum() {
        int sum;
        for (int i = 1; i <= 10_000; i++) {
            int[] factors = findFactor(i);
            sum = 0;
            for (int factor : factors) {
                sum += factor;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    private int[] findFactor(int input) {
        int[] rtnArray = new int[input];
        int j = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                rtnArray[j] = i;
                j++;
            }
        }
        return rtnArray;
    }


}
