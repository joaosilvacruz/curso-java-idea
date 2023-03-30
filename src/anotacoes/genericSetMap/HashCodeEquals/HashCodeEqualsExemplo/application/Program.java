package anotacoes.genericSetMap.HashCodeEquals.HashCodeEqualsExemplo.application;

import anotacoes.genericSetMap.HashCodeEquals.HashCodeEqualsExemplo.entities.Client;

public class Program {
    public static void main(String[] args) {
        // Nesse caso, o hashcode implementado na classe Client, verifica se o nome e email sao iguais.

        Client c1 = new Client("Fernanda", "jaumvic@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Fernanda", "fernanda@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}
