package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Set the Width and the Height of your rectangle: ");

        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.println("Area " + rectangle.area());
        System.out.println("Perimiter " + rectangle.perimiter());
        System.out.println("Diagonal " + rectangle.diagonal());

        sc.close();
    };
}