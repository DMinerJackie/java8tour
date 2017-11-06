package guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * Created by jackie on 17/11/6.
 */
public class OrderingDemo {
    @Test
    public void testOrdering() {
        List<Integer> list = Lists.newArrayList();
        list.add(new Integer(5));
        list.add(new Integer(15));
        list.add(new Integer(4));
        list.add(new Integer(19));
        list.add(new Integer(45));
        list.add(new Integer(55));
        list.add(new Integer(87));
        list.add(new Integer(65));
        list.add(new Integer(23));
        list.add(new Integer(78));
        list.add(new Integer(71));

        Ordering ordering = Ordering.natural(); // 按照自然顺序排序
        System.out.println("input list: " + list);

        Collections.sort(list, ordering);   // 针对list集合采用ordering规则即自然排序进行排序
        System.out.println("sorted list: " + list);

        System.out.println("=====================");
        System.out.println("list is sorted: " + ordering.isOrdered(list));  // 是否已经有序
        System.out.println("min of list: " + ordering.min(list));   // 取集合最小值
        System.out.println("max of list: " + ordering.max(list));   // 去集合最大值

        System.out.println("=====================");
        Collections.sort(list, ordering.reverse()); // 倒序排序
        System.out.println("list is sorted: " + ordering.isOrdered(list));
        System.out.println("sorted list: " + list);

        System.out.println("=====================");
        list.add(null);
        System.out.println("Null added to sorted list: " + list);   // 将null插入最末尾

        System.out.println("=====================");
        Collections.sort(list, ordering.nullsFirst());
        System.out.println("Null first sorted list: " + list);  // 将null放在最前面
    }
}

