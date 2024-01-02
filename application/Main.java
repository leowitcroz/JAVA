package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter de measures of the triangle X: ");

        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter de measures of the triangle Y: ");

        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;

        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;

        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X Area : %.4f%n", areaX);
        System.out.printf("Triangle Y Area : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Lager area X");
        } else {
            System.err.println("Larger Area Y");
        }

        sc.close();
    };
}