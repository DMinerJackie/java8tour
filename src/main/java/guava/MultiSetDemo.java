package guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by jackie on 17/11/6.
 */
public class MultiSetDemo {
    @Test
    public void testCollection() {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("d");
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("b");
        multiset.add("b");
        multiset.add("b");

        System.out.println("occurrence of b: " + multiset.count("b"));  // b出现的次数，multiSet允许同一元素出现多次
        System.out.println("size of multiSet: " + multiset.size());   //    multiSet的size

        System.out.println("===========================");
        Set<String> distinctSet = multiset.elementSet();
        System.out.println("distinct set of multiSet: " + distinctSet);

        System.out.println("===========================");
        Iterator<String> iterator = multiset.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String string : multiset) {
            System.out.println(string);
        }

        System.out.println("===========================");
        multiset.remove("b", 5);    // 移除集合中5个b
        System.out.println("multiSet after removed specified elements: " + multiset);
    }
}
