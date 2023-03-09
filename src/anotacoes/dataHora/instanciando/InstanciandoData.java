package anotacoes.dataHora.instanciando;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InstanciandoData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando local date
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-03-09");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-09T14:20:27");
        Instant d06 = Instant.parse("2023-03-09T14:20:27Z");

        // Definindo um formato de data personalizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);

        // Definindo um formato de data personalizado
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 14:50", fmt2);

        // Instanciando a partir de valores como argumento
        LocalDate d10 = LocalDate.of(2023, 3, 9);
        LocalDateTime d11 = LocalDateTime.of(2023,3,9, 14, 30, 5);

        System.out.println("data atual: " + d01);
        System.out.println("data atual e tempo atual: " + d02);
        System.out.println("Instante atual em Londres: " + d03);
        System.out.println("Data convertida a partir de um texto: " + d04);
        System.out.println("Data e hora convertidas a partir de um texto: " + d05);
        System.out.println("Data e hora convertidas de LONDRES a partir de um texto: " + d06);
        System.out.println("Data em outro formato: " + d08);
        System.out.println("Data e hora em outro formato: " + d09);
        System.out.println("Data  por valores: " + d10);
        System.out.println("Data e hora por valores: " + d11);

    }
}
