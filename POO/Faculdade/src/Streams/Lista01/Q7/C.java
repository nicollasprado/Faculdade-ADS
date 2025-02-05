package Streams.Lista01.Q7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("test", "abc", "quadrado", "cinq", "jk");

        Map<Boolean, List<String>> groupsStr = strs.stream()
                .collect(Collectors.groupingBy(n -> n.length() > 3));

        String filteredStrs = (groupsStr.get(true)).stream().reduce(String::concat).orElse("");

        System.out.println(filteredStrs);
    }
}
