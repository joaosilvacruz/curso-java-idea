package anotacoes.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas1 {
    public static void main(String[] args) {
        // Lista não aceita tipos primitivos, apenas as wrapper class
        // É necessário usar new e o tipo de lista que você irá querer
        // Adicionar elementos na lista
        List <String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Joao");
        list.add("Robson");
        list.add("Anna");
        list.add("Marcos");
        list.add("Analaura");

        // Adicionar elementos com posição específica
        list.add(2, "JoaoPosicao2");

        // Remover itens da lista por valor e por posição
        list.remove("Maria");
        list.remove(1);

        // Remover itens da lista com função lambda
        list.removeIf(x -> x.charAt(0) == 'M');

        // Tamanho da lista
        System.out.println(list.size());

        for (String x: list) {
            System.out.println(x);
        }

        // Saber o index de um elemento da lista
        System.out.println("----------------");
        System.out.println("Index of Anna: " + list.indexOf("Anna"));

        System.out.println("----------------");
        // Java 8 em diante adicionou o strem
        // O que está ocorrendo no código é:
        // Converte para stream, filtra usando o lambda e converte para lista novamente
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(result);

        System.out.println("----------------");
        // Encontrando apenas o primeiro nome com a letra A e retornando no array
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name );

    }
}
