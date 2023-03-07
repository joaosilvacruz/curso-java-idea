package anotacoes.encapsulamento.application;

import anotacoes.encapsulamento.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(name, price, quantity);
        //Com private o programa não pode acessar diretamente o atributo
        //Product.name = "computer";
        p1.setName("Computer");
        //Não é possível imprimir o nome sem o get
        //System.out.println("Update name: " + p1.name);
        System.out.println("Update name: " + p1.getName());

        System.out.println("Print with toString");
        System.out.println(p1);
        System.out.println();

        System.out.println("Print without toString");
        System.out.printf("Product data: %s, $%.2f, %d units, $%.2f %n",p1.getName(), p1.getPrice(), p1.getQuantity(), p1.totalValueInStock());
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        p1.addProducts(quantity);

        System.out.println("Update data: " + p1);

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        p1.removeProducts(quantity);

        System.out.println("Update data: " + p1);

    }
}
