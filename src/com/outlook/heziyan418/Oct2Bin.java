package com.outlook.heziyan418;

import java.util.Scanner;

/**
 * 4.37
 */
public class Oct2Bin {

    public void oct2binWithCheck() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int oct = scanner.nextInt();
            System.out.println("Bin: " + oct2bin(oct));
            System.out.println(check(oct));
        }
    }

    public String oct2bin(int oct) {
        StringBuilder sb = new StringBuilder();
        while (oct != 0) {
            sb.insert(0, oct & 0x1);
            oct = oct >> 1;
        }
        return sb.toString();
    }

    private boolean check(int oct) {
        String s1 = oct2bin(oct);
        String s2 = Integer.toBinaryString(oct);
        return s1.equals(s2);
    }
}
