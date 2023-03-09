package anotacoes.dataHora.instanciando;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.time.format.DateTimeFormatter;


public class DataEmTexto {
    public static void main(String[] args) {
        // CONVERTENDO DATA EM TEXTO, A FIM DE QUE O PRINT SEJA NO FORMATO DIFERENTE DO ISO 8601

        LocalDate d04 = LocalDate.parse("2023-03-09");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-09T14:20:27");
        Instant d06 = Instant.parse("2023-03-09T14:20:27Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Para formatar uma data global tipo INSTANT, é necessário informar a zona, ou seja fuso horário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // Criando DateTimeFormatter com ISOS pré definidos
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;


        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));

        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + fmt2.format(d05));

        // Imprimindo data global (INSTANT) com formatação
        System.out.println("d06 = " + fmt3.format(d06));

        // Imprimindo com ISO pré definido
        System.out.println("d05 = " + fmt4.format(d05));
    }
}
