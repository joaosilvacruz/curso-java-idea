package applications.applicationTriangle.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNoClass {
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

        double p1 = (l1A + l2A + l3A) / 2.0;
        double area1 = Math.sqrt(p1 * (p1 - l1A) * (p1 - l2A) * (p1 - l3A));

        double p2 = (l1B + l2B + l3B) / 2.0;
        double area2 = Math.sqrt(p2 * (p2 - l1B) * (p2 - l2B) * (p2 - l3B));

        System.out.printf("The area of triangle 1 is: %f %nThe area of triangle 2 is: %f %n", area1, area2);

        if (area1 > area2){
            System.out.println("The area 1 is larger");
        } else if (area1 == area2) {
            System.out.println("The areas are equals");
        } else {
            System.out.println("The area 2 is larger");
        }
    }
}
