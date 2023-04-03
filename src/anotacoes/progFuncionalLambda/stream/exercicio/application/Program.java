package anotacoes.progFuncionalLambda.stream.exercicio.application;



import anotacoes.progFuncionalLambda.stream.exercicio.entities.Product;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "src/anotacoes/progFuncionalLambda/stream/exercicio/files/in.txt";
        String target = "src/anotacoes/progFuncionalLambda/stream/exercicio/files/out.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String [] fields = itemCsv.split(",");

                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                list.add(new Product(name, price));

                System.out.println(itemCsv);
                itemCsv = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x+y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> listNames = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            listNames.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
