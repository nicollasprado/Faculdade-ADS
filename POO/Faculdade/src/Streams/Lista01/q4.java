package Streams.Lista01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Dada uma lista de nomes, use collect para criar uma única string com todos os nomes separados por vírgulas.


public class q4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("pedro", "lucas", "marina", "joana", "carlos");

        String formattedNames = names.stream().collect(Collectors.joining(", "));
        System.out.println(formattedNames);
    }
}
