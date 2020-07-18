package com.outlook.heziyan418;

import java.util.ArrayList;
import java.util.List;

public class PrintLeapYear {
    public void printLeapYear(int start, int end) {
        List<Integer> years = new ArrayList<>();
        for (int year = start; year <= end; year++) {
            if (year % 100 != 0) {
                if (year % 4 == 0) {
                    years.add(year);
                }
            } else if (year % 400 == 0) {
                years.add(year);
            }
        }
        int size = years.size();
        for (int i = 0; i < size; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(years.get(i));
            } else {
                System.out.print(years.get(i) + "\t");
            }
        }
    }
}
