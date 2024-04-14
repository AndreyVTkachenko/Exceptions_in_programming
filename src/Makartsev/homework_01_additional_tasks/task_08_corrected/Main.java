package Makartsev.homework_01_additional_tasks.task_08_corrected;

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

        int[][] array3 = {
                {20, 21, 22},
                {23, 24, 25},
                {26, 27, 28},
                {29, 30, 31},
                {32, 33, 34}
        };

        int[][] array4 = {
                {35, 36, 37},
                {38, 39, 40, 41},
                {42, 43, 44},
                {45, 46, 47}
        };

        checkArrays(array1);
        System.out.println("===================================================================");
        System.out.println();
        checkArrays(array2);
        System.out.println("===================================================================");
        System.out.println();
        checkArrays(array3);
        System.out.println("===================================================================");
        System.out.println();
        checkArrays(array4);
    }

    public static void checkArrays(int[][] array) {
        // Ну какой переворот... Просто создаём новый
        int[][] reversArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                reversArray[j][i] = array[i][j];
            }
        }

        // Проверка
        int minLength = Math.min(array.length, reversArray.length);
        for (int i = 0; i < minLength; i++) {
            if (array[i].length != reversArray[i].length) {
                // Вспомним StringBuilder
                StringBuilder sb = new StringBuilder();
                sb.append("На элементе главной диагонали с индексом [")
                        .append(i)
                        .append(";")
                        .append(i)
                        .append("] исходного двумерного массива количество строк и столбцов отличается");
                System.out.println(sb.toString());

            }
        }
    }
}
