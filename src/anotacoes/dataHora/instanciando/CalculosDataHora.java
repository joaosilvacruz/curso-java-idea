package anotacoes.dataHora.instanciando;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-03-09");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-09T14:20:27");
        Instant d06 = Instant.parse("2023-03-09T14:20:27Z");

        // Calculando a data para 1 semana antes da data informada
        // Criando data adicionando 7 dias e uma adicionado 7 dias ao d04
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

        // REALIZANDO CALCULOS COM DATA GLOBAL
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalDate: " + pastWeekInstant);
        System.out.println("nextWeekLocalDate: " + nextWeekInstant);

        // CALCULANDO COM LOCALDATETIME
        Duration t1 = Duration.between(d05, d05);
        System.out.println("t1 dias = " + t1.toDays());

        // CALCULANDO COM LOCALDATE
        Duration t2 = Duration.between(d04.atTime(0, 0), d04.atTime(0,0));
        System.out.println("t1 dias = " + t1.toDays());





    }
}
