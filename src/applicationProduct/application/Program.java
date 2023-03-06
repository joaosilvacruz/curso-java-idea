package applicationProduct.application;

import applicationProduct.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Product p1;
        p1 = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        p1.name = sc.next();
        System.out.print("Price: ");
        p1.price = sc.nextDouble();
        System.out.print("Quantity: ");
        p1.quantity = sc.nextInt();

        System.out.println("Print with toString");
        System.out.println(p1);
        System.out.println();

        System.out.println("Print without toString");
        System.out.printf("Product data: %s, $%.2f, %d units, $%.2f %n",p1.name, p1.price, p1.quantity, p1.totalValueInStock());
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        p1.addProducts(quantity);

        System.out.println("Update data: " + p1);

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        p1.removeProducts(quantity);

        System.out.println("Update data: " + p1);

    }
}
