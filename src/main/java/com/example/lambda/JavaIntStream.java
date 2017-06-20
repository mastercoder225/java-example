package com.example.lambda;

import java.util.Random;
import java.util.stream.IntStream;

public class JavaIntStream {

    public static void main(String[] args) {
        IntStream a = IntStream.empty(); // []
        IntStream b = IntStream.range(1, 5); // [1, 2, 3, 4]
        IntStream c = IntStream.rangeClosed(5, 10); // [1, 2, 3, 4, 5]
        IntStream d = IntStream.of(1); // [1]
        IntStream e = IntStream.of(1, 2, 3, 4, 5); // [1, 2, 3, 4, 5]
        IntStream f = IntStream.concat(b, c); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        IntStream g = IntStream.generate(() -> new Random().nextInt(100)).limit(5);
        IntStream i = IntStream.iterate(0, x -> x + 1).limit(5); // [0, 1, 2, 3, 4]
        IntStream j = IntStream.builder().add(1).add(2).add(3).build(); // [1, 2, 3]
        // Arrays.stream()
        // Files.lines()

















    }
}
