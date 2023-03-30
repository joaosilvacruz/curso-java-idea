package anotacoes.genericSetMap.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExLinkedHashSet {
    public static void main(String[] args) {
        // O treeset ordena os dados

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p: set) {
            System.out.println(p);
        }
    }
}
