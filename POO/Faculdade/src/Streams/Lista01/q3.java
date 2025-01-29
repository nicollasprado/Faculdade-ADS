package Streams.Lista01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


// Crie uma lista de números e use reduce para calcular a soma de todos os elementos.


public class q3 {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // IntStream::boxed turns an IntStream into a Stream<Integer>
        List<Integer> nums = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        List<String> str = Arrays.asList("a", "b", "c");

        int numsSum = nums.stream().reduce(0, (subtotal, nextElement) -> subtotal + nextElement);
        // forma mais facil -->  int numsSum = nums.stream().reduce(0, -> Integer::sum);
        System.out.println(numsSum);

        String strConcat = str.stream().reduce("", String::concat);
        System.out.println(strConcat);
    }
}
