package lambda;

import model.Apple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 对于比较器，使用lambda和未使用lambda
 * Created by jackie on 17/9/13.
 */
public class ComparatorLambda {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple(100, "green"),
                                           new Apple(150, "red"),
                                           new Apple(120, "yellow"));

        System.out.println(apples);

        // 与下面使用lambda表达式等效
//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight().compareTo(o2.getWeight());
//            }
//        });

//        System.out.println(apples);

        Collections.sort(apples, (Apple apple1, Apple apple2) -> apple1.getWeight().compareTo(apple2.getWeight()));
        System.out.println(apples);
    }
}
