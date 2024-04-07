package Makartsev.homework_01_additional_tasks.task_08;

/*
Реализуйте метод, принимающий в качестве аргументов двумерный массив.
Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
детализировать какие строки со столбцами не требуется.
Как бы вы реализовали подобный метод?
 */

public class Main {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array2 = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18, 19}
        };

        checkArray(array1);
        System.out.println("===================================================================");
        System.out.println();
        checkArray(array2);
    }

    public static void checkArray(int[][] array) {
        int cols = array[0].length;
        boolean allEqual = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length != cols) {
                allEqual = false;
                System.out.println("Строка " + (i + 1) + " имеет длину, отличную от первой строки");
            }
        }

        if (allEqual) {
            System.out.println("Длина всех строк и столбцов с одинаковым индексом одинакова");
        }
    }
}
