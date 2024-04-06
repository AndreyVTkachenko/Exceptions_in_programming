package Moiseev.seminars.seminar_03.task_03;

/*
1. Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное для
пользователя сообщение об ошибке.
2. Создайте класс исключений, которые будут возникать при обращении к пустому элементу в массиве ссылочного типа.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно
отображать понятное для пользователя сообщение об ошибке.
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            try {
                throw new DivisionByZero();
            } catch (DivisionByZero ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("_________________________________________________________________________________________");

        int i = 0;
        try {
            Integer[] array = {1, 2, 3, 4, null, 6, 7, 8, 9, 0};
            for (; i < array.length; i++) {
                System.out.println(array[i]);
                array[i]++;
            }
        } catch (NullPointerException e) {
            try {
                throw new NullPointerArray(i);
            } catch (NullPointerArray ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("_________________________________________________________________________________________");

        String path = "wqeqwesdasd.txt";
        try (FileReader fr = new FileReader(path)) {
            int a = 5;
        } catch (FileNotFoundException e) {
            try {
                throw new NotFile(path);
            } catch (NotFile ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

