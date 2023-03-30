package anotacoes.genericSetMap.set.Exercicio1.appplication;

import anotacoes.genericSetMap.set.Exercicio1.entities.User;
import applicationFiles.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Enter file full path: ");
        String sourceFileStr = "/home/joaocruz/ws-idea/curso-java/src/anotacoes/genericSetMap/set/Exercicio1/files/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            Set<User> set = new HashSet<>();

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(" ");
                String name = fields[0];
                Instant instant = Instant.parse(fields[1]);
                LocalDateTime date = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

                set.add(new User(name, date));
                itemCsv = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
