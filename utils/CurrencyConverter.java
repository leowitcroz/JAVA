package utils;

public class CurrencyConverter {
    public static double dollarToRealWithIof(double dollar, double quantityDollar) {
        return (dollar * quantityDollar) * 1.06;
    }
}
