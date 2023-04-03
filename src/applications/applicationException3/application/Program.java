package applications.applicationException3.application;

import applications.applicationException3.model.entities.Reservation;
import applications.applicationException3.model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    // IMPLEMENTAÇÃO DE SOLUÇÃO DE ERROS BOA, VISTO QUE
    // OS TRATAMENTOS ESTÃO DENTRO DO PROGRAMA PRINCIPAL, DELEGAÇÃO INCORRETA

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            Integer roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), fmt1);
            System.out.print("CHeck-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), fmt1);

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), fmt1);
            System.out.print("CHeck-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), fmt1);

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);

        }  catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }  catch (RuntimeException e){
        System.out.println("Unexpected error");
        }

        sc.close();

    }
}
