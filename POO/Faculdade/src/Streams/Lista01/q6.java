package Streams.Lista01;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;


// Crie uma lista de 1000 números aleatórios e use parallelStream para encontrar o maior número.


public class q6 {
    public static void main(String[] args) {
        Random ran = new Random();
        // ArrayList<Integer> nums = IntStream.range(1, 1001).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 1000; i++) nums.add(ran.nextInt(1001));

        Optional<Integer> max = nums.parallelStream().max(Integer::compare);
        System.out.println(max.orElse(-1));
    }
}
