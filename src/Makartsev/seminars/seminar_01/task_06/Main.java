package Makartsev.seminars.seminar_01.task_06;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
        int a=10, b=1;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
         // callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-9);
        ArrayList<String> ls = new ArrayList<>();
        ls.add("cat");
        return ls;
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        FileInputStream fis = new FileInputStream("C:\\Users\\gepat\\Documents\\Обучение в GeekBrains" +
                "\\Исключения в программировании и их обработка\\Exceptions in programming" +
                "\\src\\Makartsev\\seminars\\seminar_01\\task_06\\1.txt");
        fis.read();

        if(fis.available() > 0) throw new RuntimeException();
        int num = callMethod4("1240"); // O - буква; 0 - ноль
        return a/b;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 1; i < strings.length; i++){
            strings[i] = s;
        }
    }
}
