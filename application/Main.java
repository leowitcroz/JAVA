package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.err.println();
        System.err.println("Product Data " + product.toString());

        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.err.println("Updated Product Data " + product.toString());

        System.err.println();

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.err.println("Updated Product Data " + product.toString());

        sc.close();
    }
};
