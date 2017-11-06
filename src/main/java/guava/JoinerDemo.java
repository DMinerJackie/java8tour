package guava;

import com.google.common.base.Joiner;
import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Joiner 提供了各种方法来处理字符串加入操作，对象等。
 * Created by jackie on 17/11/6.
 */
public class JoinerDemo {

    @Test
    public void testJoiner() {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(Joiner.on(",").join(list));
        System.out.println(StringUtils.join(list, ","));
    }
}
