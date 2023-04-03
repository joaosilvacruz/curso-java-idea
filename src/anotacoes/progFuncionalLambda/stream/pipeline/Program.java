package anotacoes.progFuncionalLambda.stream.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        /* um pipeline é uma sequência de operações que podem ser aplicadas a uma coleção de dados usando a API de streams.
         O pipeline começa com a fonte de dados (uma lista por exemplo)
         Após isso há operações intermediárias para manipular a stream, no caso o filter e o map
         Por fim há a operação terminal para produzir o resultado, que necesse caso é o collect.
        */
        List<Integer> newList = list.stream()
                .filter(x -> x%2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }

}
