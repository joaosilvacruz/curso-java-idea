package anotacoes.progFuncionalLambda.interfacesFuncionais.consumer.application;

import anotacoes.progFuncionalLambda.interfacesFuncionais.consumer.entities.Product;
import anotacoes.progFuncionalLambda.interfacesFuncionais.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Reference Method com implementação da Interface
        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
        System.out.println("----------------------------");
        for (Product p: list) {
            System.out.println(p);
        }

        // Reference Method com método estático
        list.forEach(Product::staticPriceUpdate);
        System.out.println("----------------------------");
        list.forEach(System.out::println);
        System.out.println("----------------------------");

        // Reference Method com método não estático
        list.forEach(Product::nonStaticPriceUpdate);
        list.forEach(System.out::println);
        System.out.println("----------------------------");

        // Reference Method com expressão lambda declarada
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.4);
        list.forEach(cons);
        list.forEach(System.out::println);
        System.out.println("----------------------------");

        // Referente Method
        list.forEach(p -> p.setPrice(p.getPrice() * 1.5));
        list.forEach(System.out::println);
        System.out.println("----------------------------");



    }
}
