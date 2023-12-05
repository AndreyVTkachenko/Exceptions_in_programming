package lessons.lesson_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\gepat\\Documents\\Обучение в GeekBrains\\Исключения" +
                " в программировании и их обработка\\Exceptions in programming\\src\\lessons\\lesson_03\\test.txt");
             FileWriter writer = new FileWriter("C:\\Users\\gepat\\Documents\\Обучение в GeekBrains\\Исключения" +
                     " в программировании и их обработка\\Exceptions in programming\\src\\lessons\\lesson_03\\file.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
        }
        System.out.println("Копирование завершено.");
    }
}

