package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        double radius = sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi: %.2f%n", calc.PI);

        sc.close();
    };
}