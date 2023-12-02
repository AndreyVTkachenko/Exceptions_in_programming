package seminars.seminar_01.task_03;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву
столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
*/

public class Main01 {
    public static void main(String[] args) {
        int[][] array2dFirst = new int[][]{
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println(sumOfArrayElement(array2dFirst));
        System.out.println("-----------------------------------------------------------------------------------------");
        int[][] array2dSecond = new int[][]{
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
        };
        System.out.println(sumOfArrayElement(array2dSecond));
        System.out.println("-----------------------------------------------------------------------------------------");
        int[][] array2dThird = new int[][]{
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 1, 1},
                {5, 6, 7, 8}
        };
        System.out.println(sumOfArrayElement(array2dThird));
    }

    public static int sumOfArrayElement(int[][] array) {
        if (array.length != array[0].length) {
            throw new RuntimeException("Могу считать только квадратный массив...");
        }
        int sumElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((array[i][j] != 1) && (array[i][j] != 0)) {
                   throw new RuntimeException("Невалидное значение элемента.");
                } else {
                    sumElements += array[i][j];
                }
            }
        }
        return sumElements;
    }
}
