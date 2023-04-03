package anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.criandoOProprioPredicado.application;

import anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.criandoOProprioPredicado.model.services.ProductService;
import anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.criandoOProprioPredicado.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        // Passando o predicado como argumento de uma função
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum1 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');

        System.out.println("Sum = " + String.format("%.2f", sum));
        System.out.println("Sum1 = " + String.format("%.2f", sum1));

    }
}
