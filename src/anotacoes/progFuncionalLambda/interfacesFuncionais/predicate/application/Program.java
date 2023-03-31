package anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.application;

import anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.entities.Product;
import anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("Headset", 85.00));
        list.add(new Product("Phone", 65.00));
        list.add(new Product("Microfone", 40.00));
        list.add(new Product("Cam", 30.00));

        // O método removeIf recebe um PREDICATE
        list.removeIf(p -> p.getPrice() >= 100);

        // O método abaixo remove de acordo com o predicado, é uma implementação do Predicate acima
        // O ProductPredicate é uma interface funcional com o método abstrato test
        list.removeIf(new ProductPredicate());

        // Usando o removeIf por meio de uma referência para o método static criado em Product
        // Reference Method com método estático
        list.removeIf(Product::staticProductPredicate);

        // Reference Method com método não estático
        list.removeIf(Product::nonStaticProductPredicate);

        // Reference Method com expressão Lambda DECLARADA
        // Dessa forma é possível passar variáveis como parâmetro
        double min = 50;
        Predicate<Product> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);

        // Reference Method com expressão Lambda INLINE
        double min1= 40;
        list.removeIf(p -> p.getPrice() >= min1);

        for (Product p: list) {
            System.out.println(p);
        }
    }
}
