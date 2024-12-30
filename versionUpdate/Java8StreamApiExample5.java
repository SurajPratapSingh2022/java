package com.sps.javaVersionUpdate;
//stream generate example in stream api
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamApiExample5 {
    public static void main(String[] args) {
        List<String> lst = Stream.generate(() -> "Dhananjay")
                .limit(10)
                .collect(Collectors.toList());

        lst.forEach(n -> System.out.print(n + " "));
    }
}

