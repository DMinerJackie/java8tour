package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * 没有使用Lambda表达式的常规做法
 * Created by jackie on 17/9/10.
 */
public class FileFilterWithoutLambda {

    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        for(File file : hiddenFiles) {
            System.out.println(file.getName());
        }
    }
}
