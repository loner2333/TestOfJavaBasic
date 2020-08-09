package com.outlook.heziyan418;

/**
 * 4.29
 * 关于排版还是要根据console设置中，tab对应的空格长度确定
 */
public class PrintCalendar {

    public void printCalendar(int year, int weekOfFirstDay) {
        for (int i = 1; i <= 12; i++) {
            weekOfFirstDay = printCalendarMonth(year, i, weekOfFirstDay);
        }
    }

    private int printCalendarMonth(int year, int month, int weekOfFirstDay) {
        // 表头
        System.out.println("\t\t\t\t\t" + Month.getMonthByValue(month).getName() +
            " " + year);
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 7; i++) {
            System.out.print(WeekDay.getWeekDayByValue(i).getShortName() + "\t\t");
        }
        System.out.println();

        int days = ShowMonthOfYear.getDaysOfYearAndMonth(year, month);
        int rowCount = 0;
        for (int i = 0; i < weekOfFirstDay; i++) {
            System.out.print("\t\t\t");
            rowCount++;
        }
        for (int i = 1; i <= days ; i++) {
            if (i < 10) {
                System.out.print(i + "\t\t\t");
            } else {
                System.out.print(i + "\t\t");
            }
            rowCount++;
            if (rowCount >= 7) {
                System.out.println();
                rowCount = 0;
            }
        }
        System.out.println();
        return rowCount;
    }

    private void printRow(int start) {

    }
}
