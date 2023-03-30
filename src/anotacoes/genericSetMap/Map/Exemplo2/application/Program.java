package anotacoes.genericSetMap.Map.Exemplo2.application;

import anotacoes.genericSetMap.Map.Exemplo2.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        // Para comparar se há uma chave dentro do map, é necessário criar os equals e hashcode
        // No código abaixo só houve a saída "true" porque foi implementado o equals e hashcode

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        // Criando uma nova chave
        Product ps = new Product("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
