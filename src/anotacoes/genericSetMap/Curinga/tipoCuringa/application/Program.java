package anotacoes.genericSetMap.Curinga.tipoCuringa.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // <?> É o SUPER TIPO de lista de qualquer tipo
        // É possível comparar tipos de listas com o super tipo da lista
        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        // Não é possível adicionar em listas tipo curinga pois o compilador não tem certeza se o valor adicionado é compatível
        // myObjs.add(3);
    }
}
