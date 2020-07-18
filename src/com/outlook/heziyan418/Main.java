package com.outlook.heziyan418;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("input year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("input week");
        int week = scanner.nextInt();
        new ShowMonthOfYear().showMonthOfYear(year, week);
    }
}
