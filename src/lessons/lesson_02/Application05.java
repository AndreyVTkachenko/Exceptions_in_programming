package lessons.lesson_02;

import java.util.Collections;

public class Application05 {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 2;
            System.out.println("Число равно: " + number);

//            String text = null;
            String text = "kx;ldfjhgzxj";
            System.out.println("Длина строки составляет: " + text.length());

            Collections.emptyList().add(new Object());

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (NullPointerException e) {
            System.out.println("Невозможно получить длину пустой строки!");
        } catch (Exception e) {
            System.out.println("Апофеоз всех исключений!");
        }
        System.out.println("Код продолжает выполняться...");
    }
}
