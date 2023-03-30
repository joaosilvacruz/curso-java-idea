package anotacoes.genericSetMap.HashCodeEquals;

public class HashCode {
    public static void main(String[] args) {

        // HashCode gera um número inteiro específico de acordo com o dado
        // Se dois objetos possuem hashcode diferentes, então eles são diferentes
        // Portanto o hashcode por ser um inteiro, pode ser que haja colisões onde objetos diferentes tenham o mesmo hashcode
        // O hashcode é utilizado pela sua rapidez de ser calculado
        // Primeiro se utiliza o hashcode e depois o equals para confirmar se realmente está ok
        String a = "Maria";
        String b = "Alex";
        String c = "Maria";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}
