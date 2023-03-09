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
        List<Employee> list = new ArrayList<>();
        for (int i=0; i<n; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                System.out.print("ID: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            employee = new Employee(id, name, salary);

            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer position = position(list, idSalary);
        if (position != null){
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(position).increaseSalary(percent);
        } else {
            System.out.println("This id doesn't exist!");
        }
        System.out.println("List of employees");
        for (Employee emp: list) {
            System.out.println(emp);
        }

    }
    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

