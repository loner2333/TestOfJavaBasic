package com.outlook.heziyan418;

/**
 * 真不一定先大后小就准确，还是要看具体数列内容的。
 * 细的我没有研究，毕竟日常也不会用java写科学计算
 * 还是找了个帖子，以后有兴趣可以看看：
 * https://blog.csdn.net/lishanleilixin/article/details/89713688
 */
public class CountPi {
    public void countPi(int n) {
        double piLeft = 0;
        for (int i = 1; i <= n; i+=2) {
            piLeft += (1.0 / (2 * i - 1) - 1.0 / (2 * i + 1));
        }
        System.out.print("current n :" + n + ", from left to right: " + (4 * piLeft));
        double piRight = 0;
        for (int i = n - 1; i >= 1; i-=2) {
            piRight += (1.0 / (2 * i - 1) - 1.0 / (2 * i + 1));
        }
        System.out.println(", from right to left: " + (4 * piRight));
        System.out.println("difference: " + (piRight - piLeft));
    }
}
