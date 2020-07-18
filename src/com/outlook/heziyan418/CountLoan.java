package com.outlook.heziyan418;

/**
 * 用了一个公式来计算月支付额；总偿还金额是月支付金额 * 12 * 年数
 * 月支付额 = (贷款总额 * 月利率) / (1 - 1 / (1 + 月利率) ^ (年数 * 12))
 */
public class CountLoan {
    public void countLoad() {
//        System.out.println("input loan");
//        Scanner scanner = new Scanner(System.in);
//        int loan = scanner.nextInt();
//        System.out.println("input year");
//        int year = scanner.nextInt();
        int loan = 10_000 * 100;
        int year = 5;
        System.out.println("Interest Rate\t\tMonthly Payment\t\tTotalPayment");
        double rateInt = 5;
        while (rateInt <= 8) {
            double rate = rateInt / 1200;
            double monthPay = loan * rate / (1 - (1 / Math.pow(1 + rate, year * 12)));
            int monthPayInt = (int) monthPay;
            monthPay = monthPayInt / 100.0;
            int totalPay = monthPayInt * 12 * year;
            System.out.println(rate + "%\t\t" + monthPay + "\t\t" + (totalPay / 100.0));
            rateInt += 0.125;
        }

    }
}
