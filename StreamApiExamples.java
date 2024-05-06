package new_javaAdvance;

import java.util.Arrays;
import java.util.List;

public class StreamApiExamples {

    public static void main(String[] args) {
        // list numbers-> Sum even
        List<Integer> numbers = Arrays.asList(10, 25, 34, 66, 79, 85, 44, 90); // for else
        // even numbers
        int sum_even = numbers.stream().filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Here is the result of the sum of even numbers: " + sum_even);
    }

}
