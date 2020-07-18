package com.outlook.heziyan418;

/**
 * Math.floorMod里面，对于负数结果，是搞了一个--的 所以对于同号情况，%的结果和Math.floorMod的结果是一致的；
 * 但是对于异号情况，%的结果是0或负数，floorMod的结果是正的，floorMod结果 - %结果等于除数
 */
class Solution {

    public static int numSub(String s) {
        long sum = 0;
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int continue1 = 0;
        for (int i = 0; i < length; i++) {
            if (charArray[i] == '1') {
                continue1++;
            } else {
                if (continue1 != 0) {
                    if (continue1 % 2 == 0) {
                        sum += continue1 / 2L * (continue1 + 1);
                    } else {
                        sum += (continue1 + 1) / 2L * continue1;
                    }
                    continue1 = 0;
                }
            }
        }
        if (continue1 != 0) {
            if (continue1 % 2 == 0) {
                sum += continue1 / 2L * (continue1 + 1);
            } else {
                sum += (continue1 + 1) / 2L * continue1;
            }
        }
        if (sum > 1_000_000_007) {
            return (int) Math.floorMod(sum, 1_000_000_007);
        }
        return (int) sum;
    }
}
