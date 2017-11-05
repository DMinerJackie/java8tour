package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jackie on 17/11/5.
 */
public class MapReduceLambda {
    public static void main(String[] args) {
        mapFunction();
        reduceFunction();
    }

    public static void mapFunction() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            System.out.println(price);
        }

        System.out.println("using map function with lambda");
        costBeforeTax.stream().map(weight -> (weight + 0.12*weight)).forEach(System.out::println);
    }

    public static void reduceFunction() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            total = total + price;

        }
        System.out.println("Total : " + total);

        double totalWeight = costBeforeTax.stream().map(weight -> (weight + 0.12*weight)).reduce((sum, weight) -> sum + weight).get();
        System.out.println("TotalWeight: " + totalWeight);
    }

}
