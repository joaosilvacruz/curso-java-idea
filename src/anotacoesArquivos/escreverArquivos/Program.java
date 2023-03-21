package anotacoesArquivos.escreverArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Night"};
        String path = "/home/joaocruz/Documents/out.txt";

        // Há duas opções na criação de arquivos:
        // Caso o arquivo exista, recriar o arquivo ou apenas adicionar o que deseja nele
        // Para recriar o arquivo, basta enviar apenas o caminho do arquivo no FileWriter
        // Para escrever no arquivo sem recriar, basta passar true como parâmetro adicional no FileWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
