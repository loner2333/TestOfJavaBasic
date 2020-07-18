package com.outlook.heziyan418;

import java.util.Objects;

/**
 * 4.28
 */
public class ShowMonthOfYear {

    public void showMonthOfYear(int year, int week) {
        for (int i = 1; i <= 11; i++) {
            int days = getDaysOfYearAndMonth(year, i);
            week = week + days;
            week = week % 7;
            System.out.println(String.format("%s 1, %d is %s",
                Objects.requireNonNull(Month.getMonthByValue(i + 1)).getName(), year,
                Objects.requireNonNull(WeekDay.getWeekDayByValue(week)).getName()));
        }
        int days = getDaysOfYearAndMonth(year, 12);
        week = week + days;
        week = week % 7;
        System.out.println(String.format("%s 1, %d is %s",
            Objects.requireNonNull(Month.getMonthByValue(1)).getName(), year + 1,
            Objects.requireNonNull(WeekDay.getWeekDayByValue(week)).getName()));
    }

    public static int getDaysOfYearAndMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }
}
