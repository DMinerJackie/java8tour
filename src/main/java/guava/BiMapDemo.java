package guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.sun.deploy.util.StringUtils;
import org.junit.Test;

/**
 * Created by jackie on 17/11/6.
 */
public class BiMapDemo {

    @Test
    public void testBiMap() {
        BiMap<Integer, String> biMap = HashBiMap.create();
        biMap.put(new Integer(1), "hello");
        biMap.put(new Integer(2), "how");
        biMap.put(new Integer(3), "are");
        biMap.put(new Integer(4), "you");

        for (BiMap.Entry<Integer, String> entry : biMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(biMap.inverse().get("how"));
        System.out.println(biMap.get("how"));
    }
}
