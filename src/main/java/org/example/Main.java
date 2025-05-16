package org.example;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.println("Name: ");

        String name = sc.nextLine();
        System.out.println("Email: ");

        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        String birthDateStr = sc.nextLine();
        Client client = new Client(name, email, sdf.parse(birthDateStr, new java.text.ParsePosition(0)));

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String statusStr = sc.nextLine();

        System.out.println("How many items to this order? ");
        int quantity = sc.nextInt();
        List<Order> items = new java.util.ArrayList<>(quantity);
        System.out.println("Enter order data: ");
        sc.nextLine();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter item #" + (i + 1) + ": ");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.println("Quantity: ");
            int q = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity,productPrice);

        }

    }
}