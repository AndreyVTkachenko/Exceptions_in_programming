package Makartsev.seminars.seminar_03.task_04;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив
размером 4х4. При подаче массива другого размера необходимо бросить
исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в
int и просуммировать. Если в каком-то элементе массива преобразование
не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в
какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные
исключения MyArraySizeException и MyArrayDataException и вывести
результат расчета (сумму элементов, при условии, что подали на вход
корректный массив).
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[][] arr = {{"12", "23", "1", "-1"},
                {"-23", "0", "5", "3"},
                {"4", "1", "0", "-7"}};
        System.out.println(sumArray(arr));
    }

    public static int sumArray(String[][] array){
        if (array.length != 4 || array[0].length != 4)
            throw new MyArraySizeException(array.length, array[0].length);
        int resultSum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try{
                    resultSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return resultSum;
    }
}

class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Размер двумерного массива должен быть 4x4");
    }

    public MyArraySizeException(int row, int column){
        super("Размер двумерного массива должен быть 4x4, у Вас (" + row + "; " + column + ")");
    }
}

class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("Невозможно преобразовать элемент в числовой формат данных");
    }

    public MyArrayDataException(int i, int j){
        super("\"Невозможно преобразовать элемент в числовой формат данных, находящийся на позиции ->" +
                " (" + i + "; " + j + ")");
    }
}
