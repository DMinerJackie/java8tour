package guava;

import com.google.common.base.*;
import com.google.common.base.Optional;
import com.google.common.collect.*;
import model.Apple;
import org.junit.Test;

import java.util.*;

/**
 * Created by jackie on 17/11/5.
 */
public class PreconditionDemo {

    @Test
    public void testCheckArgument() {
        String name = "jackie";
        Preconditions.checkArgument(name != null && !"".equals(name), "name can't be empty");
    }

    @Test
    public void testOptional() {
        Optional<String> name = Optional.of(null);
        if (name.isPresent()) {
            System.out.println(name.get());
        }
    }

    @Test
    public void testJoiner() {
        List<String> strList = Arrays.asList("hello", "world");
        StringBuilder stringBuilder = new StringBuilder();
        String result = Joiner.on("--").appendTo(stringBuilder, strList).toString();
        System.out.println(result);
    }

    @Test
    public void testSplitter() {
        String str = "dd  sfsfs  , dsfsf,ssfdfsdffsdfsf.sdfsfs,msfds";
        for (String name : Splitter.on(",").trimResults().splitToList(str)) {
//        for (String name : Splitter.on(",").limit(2).splitToList(str)) {  // 限制只取前两个
            System.out.println(name);
        }
    }

    @Test
    public void testImmutbale() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "world");
        System.out.println("map: " + map);

        ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(1, "hello", 2, "world", 3, "new", 4, "new", 5, "new");
        System.out.println(immutableMap.toString());
    }

    @Test
    public void testListMap() {
        Multimap<Integer, String> keyValues = ArrayListMultimap.create();
        keyValues.put(1, "hello");
        keyValues.put(1, "world");
        keyValues.put(2, "you");
        keyValues.put(2, "are");
        keyValues.put(2, "nice");
        System.out.println(keyValues);
    }

    @Test
    public void testSets() {
        HashSet setA = Sets.newHashSet(1,2,3,4,5);
        HashSet setB = Sets.newHashSet(1,3,5,7,9);

        Sets.SetView union = Sets.union(setA, setB);
        System.out.println(union);

        Sets.SetView difference = Sets.difference(setA, setB);
        System.out.println(difference);

        Sets.SetView intersection = Sets.intersection(setA, setB);
        System.out.println(intersection);

        Map<String, String> mapA = Maps.newHashMap();
        mapA.put("1", "hello");
        mapA.put("2", "world");
        mapA.put("3", "nice");

        Map<String, String> mapB = Maps.newHashMap();
        mapB.put("1", "hello");
        mapB.put("4", "worldB");
        mapB.put("6", "nice");
        MapDifference<String, String> differenceResult = Maps.difference(mapA, mapB);
        System.out.println(differenceResult.entriesOnlyOnLeft());
        System.out.println(differenceResult.entriesOnlyOnRight());
    }
}
