package anotacoes.anotacoesArquivos.manipularPastas;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Imprimindo a lista de pastas no mesmo diretório da pasta digitada
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder: folders) {
            System.out.println(folder);
        }
        System.out.println();

        // Imprimindo a lista de arquivos no mesmo diretório da pasta digitada
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES");
        for (File file:files) {
            System.out.println(file);
        }

        // Criando uma subpasta;
        boolean sucess= new File(strPath + "/folder").mkdir();
        System.out.println("\nDirectory create sucessfully " + sucess);



        sc.close();
    }
}
