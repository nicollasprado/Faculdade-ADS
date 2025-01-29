package Streams.Lista01;

import java.util.Arrays;


// Crie uma lista de números inteiros e use Streams para imprimir apenas os números pares.


public class q1 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for(int i=0; i < 100; i++){
            nums[i] = i;
        }

        Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
