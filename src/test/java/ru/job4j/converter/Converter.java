package ru.job4j.converter;

/**
 * Class Converter для конвертации валюты
 * @author kboriskin
 * @since 05.05.2020
 * @version 1
 */
public class Converter {
    /**
     * конвертация рубля в евро
     * @param value
     * @return
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * конвертация рубля в доллар
     * @param value1
     * @return
     */
    public static int rubleToDollar(int value1) {
        int rsl = value1 / 60;
        return rsl;
    }
    /**
     * тест метода rubleToEuro
     */
    public static void testRubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
    /**
     * тест метода rubleToDollar
     */
    public static void testRubleToDollar() {
        int in = 140;
        int expected = 2;
        int out = rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        Converter.testRubleToEuro();
        Converter.testRubleToDollar();
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}

