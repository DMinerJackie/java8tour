package lambda;

import model.Apple;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by jackie on 17/11/5.
 */
public class CollectionTransformLambda {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple(1, "red"), new Apple(2, "green"), new Apple(3,"yellow"));
        list2Map(appleList);

        Map<Integer, String> appleMap = new HashMap<>();
        appleMap.put(1, "red");
        appleMap.put(2, "green");
        appleMap.put(3, "yellow");
        map2List(appleMap);

        list2Set(appleList);

        Set<Apple> appleSet = new HashSet<>();
        appleSet.add(new Apple(1, "red"));
        appleSet.add(new Apple(2, "green"));
        appleSet.add(new Apple(3,"yellow"));
        set2List(appleSet);
    }

    /**
     * list转map
     * @param apples
     */
    public static void list2Map(List<Apple> apples) {
        Map<String, Integer> appleMap = apples.stream().collect(Collectors.toMap(Apple::getColor, Apple::getWeight));
//        Map<String, Integer> appleMap = apples.stream().filter(apple -> apple.getColor().equals("red")).collect(Collectors.toMap(Apple::getColor, Apple::getWeight));
//        Map<String, Integer> appleMap = apples.stream().filter(apple -> apple.getColor().equals("red")).collect(Collectors.toMap(apple -> apple.getColor(), apple -> apple.getWeight()));
        System.out.println("list to map, appleMap: " + appleMap);
    }

    /**
     * map转list
     * @param appleMap
     */
    public static void map2List(Map<Integer, String> appleMap) {
        List<String> apples = new ArrayList<>(appleMap.values());
        List<Integer> keys = new ArrayList<Integer>(appleMap.keySet());
        System.out.println("map values to list, colors: " + apples);
        System.out.println("map keys to list, weights: " + keys);
    }

    /**
     * list转set
     * @param apples
     */
    public static void list2Set(List<Apple> apples) {
        Set<Apple> appleSet = new HashSet<>(apples);
        System.out.println("list to set, appleSet: " + appleSet);
    }

    /**
     * set转list
     * @param apples
     */
    public static void set2List(Set<Apple> apples) {
        List<Apple> appleList = new ArrayList<>(apples);
        System.out.println("set to list, appleList: " + appleList);
    }
}
