package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the price of the dollar: ");

        double dollar = sc.nextDouble();

        System.out.println("How many dollars will you buy: ");
   
        double quantityDollar = sc.nextDouble();

        double priceToPay = CurrencyConverter.dollarToRealWithIof(dollar,quantityDollar);

        System.out.printf("Amount to be paid: %.2f%n", priceToPay);

        sc.close();
    };
}