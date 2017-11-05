package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by jackie on 17/11/5.
 */
public class MultiPredicateLambda {
    public static void main(String[] args) {
        Predicate<String> startWithP = ((str) -> str.startsWith("h"));
        Predicate<String> lengthP = str -> str.length() > 3;

        List<String> strList = Arrays.asList("hello world,", "hello everyone,", "nice!");
        strList.stream().filter(startWithP.and(lengthP)).forEach(System.out::println);
    }
}
