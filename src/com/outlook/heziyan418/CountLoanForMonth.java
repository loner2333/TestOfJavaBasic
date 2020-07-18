package com.outlook.heziyan418;

public class CountLoanForMonth {
    public void countLoanForMonth() {
        int loan = 10_000 * 100;
        int year = 1;
        int yearRate = 7;

        double monthRate = yearRate / 12.0 / 100;
        int month = year * 12;
        System.out.println("Month\t\t利息\t\t本金\t\t余额");
        double monthPay = loan * monthRate / (1 - (1 / Math.pow(1 + monthRate, year * 12)));
        monthPay = (int) monthPay;
        double balance = loan;
        for (int i = 1; i <= month; i++) {
            double interest = balance * monthRate;
            interest = (int) interest;
            double principal = monthPay - interest;
            balance = balance - principal;
            System.out.println(String.format("%d\t\t%.2f\t\t%.2f\t\t%.2f", i, interest / 100,
                    principal / 100, balance / 100));
        }
    }
}
