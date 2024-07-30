package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);


        List<Integer> squaredNumbers = evenNumbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squared Even Numbers: " + squaredNumbers);

        String evenNumbersString = evenNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Even Numbers as String: " + evenNumbersString);

        int sumOfEvenNumbers = evenNumbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);

        Optional<Integer> maxEvenNumber = evenNumbers.stream()
                .reduce(Integer::max);

        maxEvenNumber.ifPresent(max -> System.out.println("Max Even Number: " + max));

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Partitioned Numbers: " + partitionedNumbers);
        int parallelSum = numbers.parallelStream()
                .reduce(0, Integer::sum);

        System.out.println("Parallel Sum: " + parallelSum);
    }
}

