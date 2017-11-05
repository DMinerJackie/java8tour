package lambda;

import lambda.Predicate.AppleGreenColorPredicate;
import lambda.Predicate.AppleHeavyWeightPredicate;
import lambda.Predicate.ApplePredicate;
import model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jackie on 17/9/12.
 */
public class FilterAppleLambda {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(100, "green"),
                                              new Apple(160, "red"),
                                              new Apple(180, "yellow"));

//        without lambda
        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println("heavyApples:" + heavyApples.toString());
        System.out.println("greenApples:" + greenApples.toString());

//        with lambda
        List<Apple> heavyApplesLambda = filterApples(inventory, (Apple apple) -> apple.getWeight() > 150);
        List<Apple> greenApplesLambda = filterApples(inventory, (Apple apple) -> "green".equals(apple.getColor()));
        System.out.println("heavyApplesLambda:" + heavyApplesLambda.toString());
        System.out.println("greenApplesLambda:" + greenApplesLambda.toString());
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
