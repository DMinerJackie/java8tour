package lambda;

import java.io.File;

/**
 * 使用了Lambda表达式，将isHidden函数作为一个参数传入，通过"::"这种形式表达
 * Created by jackie on 17/9/10.
 */
public class FileFilterWithLambda {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        for (File file : hiddenFiles) {
            System.out.println(file.getName());
        }
    }
}
