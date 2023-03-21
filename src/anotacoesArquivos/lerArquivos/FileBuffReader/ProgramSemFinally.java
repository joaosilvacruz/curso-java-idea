package anotacoesArquivos.lerArquivos.FileBuffReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramSemFinally {

    // PARA EVITAR O FINALLY USA-se o buffered Reader dentro do escopo do try
    public static void main(String[] args) {
        String path = "/home/joaocruz/Documents/in.txt";

        // O nome desse bloco try é: Try with resources;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
