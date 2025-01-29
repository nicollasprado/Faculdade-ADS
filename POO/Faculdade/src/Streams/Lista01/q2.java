package Streams.Lista01;

import java.util.Arrays;
import java.util.List;


// Dada uma lista de strings, use filter para encontrar palavras com mais de 5 caracteres e map para convertê-las em maiúsculas.


public class q2 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("abcd", "efghijkl", "mn", "opqr", "stuvwxiv");

        str.stream()
                .filter(s -> s.length() <= 5)
                .forEach(s -> System.out.println(s.toUpperCase()));
    }
}
