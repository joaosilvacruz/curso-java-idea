package exercicios.exercListas.application;

import exercicios.exercListas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        Employee employee;
        List<String> listNames = new ArrayList<>();
        List<Integer> listId = new ArrayList<>();
        List<Double> listSalary = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            employee = new Employee(id, name, salary);

            listNames.add(employee.getName());
            listId.add(employee.getId());
            listSalary.add(employee.getSalary());
        }

        System.out.println(listId);
        System.out.println(listNames);
        System.out.println(listSalary);

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        boolean result = listId.stream().filter(x -> x == id).findAny().isEmpty();
        if (result == false){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            int idChoiced = listId.indexOf(id);
            double currentValue = listSalary.get(idChoiced);
            double futureValue = currentValue + currentValue * percentage/100;
            listSalary.set(idChoiced, futureValue);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees");
        for (int i = 0; i<listId.size(); i++) {
            System.out.println(listId.get(i) + ", " + listNames.get(i) + ", " + listSalary.get(i));
        }


    }
}
