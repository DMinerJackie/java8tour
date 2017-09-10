package lambda;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Created by jackie on 17/9/10.
 */
public class PredicateDemo {

    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("床前明月光"));
        books.add(new String("疑是地上霜"));
        books.add(new String("门前大桥下"));
        books.add(new String("游过一群鸭"));
        books.add(new String("大河向东流"));
        books.add(new String("天上的星星参北斗啊"));
        System.out.println(filter(books, ele-> ((String)ele).contains("床")));
        System.out.println(filter(books, ele->((String)ele).contains("大")));
        System.out.println(filter(books, ele->((String)ele).length() >5));
    }

    public static int filter(Collection books, Predicate predicate) {
        int total = 0;
        for (Object object : books){
            if (predicate.test(object)) {
                total++;
            }
        }
        return total;
    }
}
