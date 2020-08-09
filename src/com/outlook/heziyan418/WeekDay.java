package com.outlook.heziyan418;

/**
 * 枚举值的排序需要注意，不然基于values()[]的方法会出问题
 */
public enum WeekDay {
    Sunday(0, "Sunday"),
    Monday(1, "Monday"),
    Tuesday(2, "Tuesday"),
    Wednesday(3, "Wednesday"),
    Thursday(4, "Thursday"),
    Friday(5, "Friday"),
    Saturday(6, "Saturday");

    int value;
    String name;
    WeekDay(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static WeekDay getWeekDayByValue(int value) {
        if (value >= 0 && value <= 6) {
            return WeekDay.values()[value];
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return name.substring(0, 3);
    }
}
