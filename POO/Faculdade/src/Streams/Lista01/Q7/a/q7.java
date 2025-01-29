package Streams.Lista01.Q7.a;

import java.util.*;
import java.util.stream.Collectors;


/*
Dada uma lista de pessoas (nome e idade), use Streams para:
 Filtrar pessoas com mais de 18 anos.
 Mapear para uma lista de nomes.
 Ordenar os nomes alfabeticamente.
Crie um Stream de números inteiros e calcule a média dos números maiores que 50.
Use Collectors.groupingBy para agrupar uma lista de palavras pelo seu tamanho.
*/


public class q7 {
    public static void main(String[] args) {
        Random ran = new Random();
        List<Person> persons = Arrays.asList(new Person(20, "Pedro"), new Person(17, "Lucas"), new Person(38, "Larissa"), new Person(22, "Caua"), new Person(15, "Julia"));

        List<String> legalAge = persons.stream()
                .filter(n -> n.getIdade() >= 18)
                .map(Person::getName)
                .sorted()
                .collect(Collectors.toList());

        legalAge.forEach(System.out::println);
    }
}
