package Streams.Lista01.Q7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B {
    public static void main(String[] args) {
        List<Integer> nums = IntStream.range(1, 101).boxed().collect(Collectors.toList());

        Long qtNumsAboveFifty = nums.stream().filter(n -> n > 50).count();
        Optional<Integer> aboveFiftySum = nums.stream().filter(n -> n > 50).reduce(Integer::sum);

        Integer qtNumsAboveFiftyInt = qtNumsAboveFifty != null ? qtNumsAboveFifty.intValue() : null;

        aboveFiftySum.ifPresent(sum -> System.out.println(sum / qtNumsAboveFiftyInt));
    }
}
