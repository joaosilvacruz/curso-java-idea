package anotacoesArquivos.lerArquivos.FileBuffReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramComFinally {

    // O BUfferedReader é instanciado a partir do FileReader
    public static void main(String[] args) {
        String path = "/home/joaocruz/Documents/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }finally {
            // No fechamento do br e do fr pode ocorrer uma exceção, por isso a necessidade do try
            try{
                if (br!=null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
