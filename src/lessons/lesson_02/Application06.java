package lessons.lesson_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application06 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("C:\\Users\\gepat\\Documents\\Обучение в GeekBrains\\Исключения в " +
                    "программировании и их обработка\\Exceptions in programming\\src\\lessons\\lesson_02\\test.txt");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Сработало исключение для закрытия файла.");
                }
            }
            System.out.println("finally finish");
        }
    }
}
