package anotacoes.progFuncionalLambda.stream.application;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 =  Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        // Criando uma stream de 10 elementos que são somados de 2 em 2
        Stream<Integer> st3 = Stream.iterate(0, x -> x +2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Criando a sequência de Fibonnaci a partir de uma stream
        // Passos: 1- iterate que o primeiro elemento é 0,1;
        // 2- Cria-se uma função que gera um Long em que o primeiro elemento é o segundo elemento anterior
        // 2.1 - E o segundo elemento é o primeiro anterior + o segundo anterior
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L},
                p -> new Long[] {p[1], p[0]+p[1]})
                .map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(30).toArray()));
    }
}
