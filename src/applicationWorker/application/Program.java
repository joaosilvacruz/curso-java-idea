package applicationWorker.application;

import applicationWorker.entities.Worker;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Worker worker1;

        System.out.print("Enter department's name: ");

        System.out.print("Enter worker data: \n");
        System.out.print("Name: ");
        System.out.print("Level: ");
        System.out.print("Base Salary: ");
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++){
            System.out.printf("Enter contract #%d data: %n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            System.out.print("Value per hour: ");
            System.out.print("Duration (hours): ");

        }

        System.out.print("Enter mounth and year to calculate income (MM/YYYY): ");


    }
}
