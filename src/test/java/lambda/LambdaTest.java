package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by jackie on 17/9/16.
 */
public class LambdaTest {
    public static void main(String[] args) {
        loop(Arrays.asList(1,2,3,4,5), (Integer i)->System.out.println("哈哈"));
    }

    private static<T> void loop(List<T> list1, Consumer<T> consumer) {
        for (T i : list1) {
            consumer.accept(i);
        }
    }
}
