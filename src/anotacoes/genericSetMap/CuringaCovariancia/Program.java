package anotacoes.genericSetMap.CuringaCovariancia;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // A covariância é quando é possível utilizar o método get, mas não o put.
        // NO caso abaixo a lista 'list' não aceita adicionar valores visto que o compilador não reconhece se o valor
        // adicionado é compatível com o tipo da lista.

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        //list.add(20);
    }
}
