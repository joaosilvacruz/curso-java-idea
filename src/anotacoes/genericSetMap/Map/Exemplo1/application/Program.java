package anotacoes.genericSetMap.Map.Exemplo1.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        // O Map é uma estrutura de chave, valor - Key, Value
        // Não permite a repetição da chave

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");

        System.out.println("ALL COOKIES: ");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));

        }
        System.out.println("Contains 'phone' key " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());
    }
}
