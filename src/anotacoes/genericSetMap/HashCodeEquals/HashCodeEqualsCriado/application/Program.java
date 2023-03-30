package anotacoes.genericSetMap.HashCodeEquals.HashCodeEqualsCriado.application;

import anotacoes.genericSetMap.HashCodeEquals.HashCodeEqualsCriado.entities.Client;

public class Program {
    public static void main(String[] args) {
        // Nesse caso, o hashcode implementado na classe Client, verifica se o nome e email sao iguais.
        // Vale lembrar que o '==' compara os endereços de memória quando se trata de objetos

        Client c1 = new Client("Fernanda", "fernanda@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Fernanda", "fernanda@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println("Comparando com Hashcode analisando nome e email");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        System.out.println("Comparando objetos com ==");
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
