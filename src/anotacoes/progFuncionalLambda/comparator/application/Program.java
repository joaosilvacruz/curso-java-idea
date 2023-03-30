package anotacoes.progFuncionalLambda.comparator.application;

import anotacoes.progFuncionalLambda.comparator.entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        /* Implementação de um comparator por uma classe criada
        list.sort(new MyComparator());
        ----------------------------------------------------------------------*/


        /* Implementação de um comparator por meio de uma classe anônima
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        list.sort(comp);
        ----------------------------------------------------------------------*/

        /* Implementação de uma comparação com uma FUNÇÃO LAMBDA - FUNÇÃO ANÔNIMA
        Comparator<Product> compLambda = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort(compLambda);
         ----------------------------------------------------------------------*/
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
