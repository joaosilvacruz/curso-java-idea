package aplicacoes.applicationException2.application;

import aplicacoes.applicationException2.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    // IMPLEMENTAÇÃO DE SOLUÇÃO DE ERROS RUIM, VISTO QUE
    // OS TRATAMENTOS ESTÃO NO PROGRAMA PRINCIAPL E NA CLASSE, PORÉM SEM O TRY

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        Integer roomNumber = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.next(), fmt1);
        System.out.print("CHeck-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.next(), fmt1);
        Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
        System.out.println(reservation);

        if (!checkOut.isAfter(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), fmt1);
            System.out.print("CHeck-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), fmt1);

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                reservation.updateDates(checkIn, checkOut);
            }
        }
        sc.close();

    }
}
