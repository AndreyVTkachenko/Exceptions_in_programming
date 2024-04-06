package Moiseev.homeworks.homework_01.task_01;

/*
Методы с исключениями.

Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
Метод divisionByZero - Деление на 0
Метод numberFormatException - Ошибка преобразования строки в число

Важно: они не должны принимать никаких аргументов
*/

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = new int[10];
        array[20] = 0;
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int result = 10 / 0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String text = "abcdefg";
        int number = Integer. parseInt(text);
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
