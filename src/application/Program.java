package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double l1A, l2A, l3A, l1B, l2B, l3B;

        System.out.println("Enter the measures of triangle A: ");
        l1A = sc.nextDouble();
        l2A = sc.nextDouble();
        l3A = sc.nextDouble();

        System.out.println("Enter the measures of triangle B: ");
        l1B = sc.nextDouble();
        l2B = sc.nextDouble();
        l3B = sc.nextDouble();

    }
}
