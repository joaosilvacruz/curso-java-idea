package anotacoes.forEach;

public class Program {
    public static void main(String[] args) {

        String [] vect = new String[] {"Joao", "Maria", "Bob"};

        System.out.println("---- Com laço for comum ----");
        for (int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("---- Com o laço ForEach ----");
        for (String elementos : vect) {
            System.out.println(elementos);
        }

    }
}
