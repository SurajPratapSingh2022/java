package com.sps.javaVersionUpdate;
//Stream iterate function in stream api
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamApiExample4 {
    public static void main(String[] args) {
        List<Integer> lst = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .collect(Collectors.toList());

        lst.forEach(n -> System.out.print(n + " "));
    }
}
