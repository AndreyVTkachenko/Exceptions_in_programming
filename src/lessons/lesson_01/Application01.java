package lessons.lesson_01;

import java.io.File;

public class Application01 {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("несуществующий файл")));
        System.out.println(getFileSize(new File("C:\\Users\\gepat\\Documents\\Обучение в GeekBrains" +
                "\\Введение в ООП\\Object_oriented_programming\\src\\homeworks\\homework_006\\task description.md")));

        System.out.println("_________________________________________________________________________________________");
        System.out.println(divide(10, 0));

        System.out.println("_________________________________________________________________________________________");
        aVoid();
    }

    public static void aVoid(){
        bVoid();
    }

    public static void bVoid(){
        cVoid();
    }

    public static void cVoid(){
        int[] array = new int[10];
        System.out.println(array[1000]);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
