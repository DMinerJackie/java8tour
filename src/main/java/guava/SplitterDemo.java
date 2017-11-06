package guava;

import com.google.common.base.Splitter;
import org.junit.Test;

/**
 * Splitter 提供了各种方法来处理分割操作字符串，对象等。
 * Created by jackie on 17/11/6.
 */
public class SplitterDemo {

    @Test
    public void testSplitter() {
        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings() // 忽略空白
                .split("the ,quick, , brown         , fox,              jumps, over, the, lazy, little dog."));
    }
}
