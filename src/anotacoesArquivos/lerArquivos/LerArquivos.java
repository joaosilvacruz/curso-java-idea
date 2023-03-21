package anotacoesArquivos.lerArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivos {
    public static void main(String[] args) {

        // Instanciando um objeto do tipo File
        File file = new File("/home/joaocruz/Documents/in.txt");
        Scanner sc = null;

        // Ao abrir um arquivo, pode existir uma exceção IOException, por isso a necessidade de utilizar o try
        // O código abaixo demonstra como abrir um arquivo e imprimir as linhas do arquivo
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        } finally {
            if(sc != null){
                sc.close();
            }
        }

    }
}
