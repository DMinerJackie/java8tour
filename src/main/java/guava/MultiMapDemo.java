package guava;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by jackie on 17/11/6.
 */
public class MultiMapDemo {

    @Test
    public void testMultiMap() {
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("lower", "a");
        multimap.put("lower", "b");
        multimap.put("lower", "c");
        multimap.put("lower", "d");
        multimap.put("lower", "e");

        multimap.put("upper", "A");
        multimap.put("upper", "B");
        multimap.put("upper", "C");
        multimap.put("upper", "D");

        System.out.println("=====================");
        List<String> lowerList = (List<String>)multimap.get("lower");
        System.out.println("lower list: " + lowerList);
        lowerList.add("f");
        System.out.println("lower list after modified: " + lowerList);

        System.out.println("=====================");
        Map<String, Collection<String>> map = multimap.asMap(); // 将multiMap转换为map集合
        for (Map.Entry<String,  Collection<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Collection<String> value =  multimap.get("upper");
            System.out.println(key + ":" + value);
        }

        System.out.println("=====================");
        Multiset<String> keys = multimap.keys();    // keys返回是未去重的set集合，keyset返回的是去重后的set集合
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("=====================");
        Collection<String> values = multimap.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
