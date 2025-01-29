package Streams.Lista01;

import java.util.stream.IntStream;

public class q5 {
    public static void main(String[] args) {
        IntStream.range(1, 100)
                .limit(10)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
