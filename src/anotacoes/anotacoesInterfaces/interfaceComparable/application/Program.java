package anotacoes.anotacoesInterfaces.interfaceComparable.application;
import anotacoes.anotacoesInterfaces.interfaceComparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "src/anotacoesInterfaces/interfaceComparable/application/in1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            // Para utilizar o Collections.sort é necessário que a lista seja do tipo Comparable
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
