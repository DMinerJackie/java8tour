package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by jackie on 17/9/18.
 */
public class GeneralTest {

    public static void main(String[] args) {
        // lambda
        Predicate<String> predicate = s -> s.length() > 0;

        System.out.println(predicate.test("hahah"));
        System.out.println(predicate.negate().test("hahah"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;


        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("hahah"));


        Function<String, Integer> toInteger = Integer::parseInt;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        System.out.println(toInteger.apply("12345"));

        Supplier<Apple> appleSupplier = Apple::new;
        System.out.println(appleSupplier.get());

        Consumer<Apple> appleConsumer = (apple) -> System.out.println("hahah"+ apple.getWeight());
        appleConsumer.accept(new Apple(122, "red"));

        System.out.println("===========================\n\n\n");
//        stream
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection.stream().filter(s -> s.startsWith("bbb")).forEach(System.out::println);
        stringCollection.stream().sorted().filter(s -> s.endsWith("2")).forEach(System.out::println);

        System.out.println("===========");
        stringCollection.stream().map(String::toUpperCase).sorted((a1, a2) -> a1.compareTo(a2)).forEach(System.out::println);

        System.out.println("===========");
        System.out.println(stringCollection.stream().anyMatch(s -> s.startsWith("a")));

        System.out.println("===========");
        System.out.println(stringCollection.stream().filter(s -> s.endsWith("1")).count());

        System.out.println("===========");
        stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "+++" + s2).ifPresent(System.out::println);
    }
}
