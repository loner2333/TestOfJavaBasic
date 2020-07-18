package com.outlook.heziyan418;

public enum Month {
    January(1, "January"),
    February(2, "February"),
    March(3, "March"),
    April(4, "April"),
    May(5, "May"),
    June(6, "June"),
    July(7, "July"),
    August(8, "August"),
    September(9, "September"),
    October(10, "October"),
    November(11, "November"),
    December(12, "December");

    int value;
    String name;

    Month(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Month getMonthByValue(int value) {
        if (value >= 1 && value <= 12) {
            return Month.values()[value - 1];
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
