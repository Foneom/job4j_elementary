package ru.job4j.loop;

public class Mortgage {

    public int year (int amount, int salary, double percent) {
        int year = 0;
        double yearCreditSummWithPercent = 0;
        double yearCreditSumm = amount + amount * (percent / 100);

        while (yearCreditSumm > 0) {
            yearCreditSumm -= salary;
            yearCreditSummWithPercent = yearCreditSumm * (percent / 100);
            yearCreditSumm = yearCreditSumm + yearCreditSummWithPercent;
            year++;
        }
            return year;
    }
}
