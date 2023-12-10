package seminars.seminar_03.task_04;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то
элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
MyArrayDataException и вывести результат расчета (сумму элементов, при условии, что подали на вход корректный массив).
*/

public class Main {
    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "null", "4"}
        };
        System.out.println(SumArray.sumArray2d(array));
        try {
            System.out.println(SumArray.sumArray2d(array1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(SumArray.sumArray2d(array2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
