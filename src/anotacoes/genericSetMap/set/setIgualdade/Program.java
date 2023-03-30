package anotacoes.genericSetMap.set.setIgualdade;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("Tv", 900.00));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Tablet", 400.00));

        // Inicialmente o valor será falso, pois o Product nao tem hashcode equals implementado
        // Assim, a análise é por ponteiros, e nesse caso os dois objetos foram de instâncias diferentes
        // Após ser adicionado
        Product prod = new Product("Notebook", 1200.00);
        System.out.println(set.contains(prod));

    }
}
