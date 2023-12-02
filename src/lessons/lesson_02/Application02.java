package lessons.lesson_02;

import java.io.File;

public class Application02 {
    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }
}
