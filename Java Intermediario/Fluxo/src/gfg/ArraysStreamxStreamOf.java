package gfg;

import java.util.*;
import java.util.stream.*;

class ArraysStreamxStreamOf {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        // Usando Arrays.stream() para converter o "int arr[]" em um fluxo (Stream)
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(str -> System.out.print(str + " "));

        // Usando Stream.of() para converter o "int arr[]" em um fluxo
        Stream<int[]> stream = Stream.of(arr);

        // Achatamento de "Stream<int[]>" para "IntStream" usando o método flatMapToInt()
        IntStream intStreamNew = stream.flatMapToInt(Arrays::stream);
        intStreamNew.forEach(str -> System.out.print(str + " "));
    }
}
