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

        System.out.printf("Product data: %s, $%.2f, %d units, $%.2f %n",p1.name, p1.price, p1.quantity, p1.totalValueInStock());
        System.out.print("Enter the number of products to be added in stock: ");


    }
}
