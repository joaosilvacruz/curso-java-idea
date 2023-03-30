package anotacoes.genericSetMap.set;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet {
    public static void main(String[] args) {
        // O set é uma estrutura que não permite duplicatas
        // O set é mais rápido e eficiente que um ArrayList
        // Utilizar o contains é melhor que utilizar um for loop com Array
        // O hashSet nao ordena os dados

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("PE");
        set.add("Sol");
        set.add("Tablet");
        set.add("Notebook");

        set.remove("Notebook");
        set.removeIf(x -> x.length() >=3);
        System.out.println(set.contains("Notebook"));

        for (String p: set) {
            System.out.println(p);
        }
    }
}
