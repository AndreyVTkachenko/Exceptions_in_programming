package seminars.seminar_01.task_03;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву
столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
*/

public class Main02 {
    public static void main(String[] args) {
        int[][] array2dFirst = new int[][]{
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1},
        };
        System.out.println(sumArray2d(array2dFirst));
        System.out.println("-----------------------------------------------------------------------------------------");
        int[][] array2dSecond = new int[][]{
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0},
        };
        System.out.println(sumArray2d(array2dSecond));
        System.out.println("-----------------------------------------------------------------------------------------");
        int[][] array2dThird = new int[][]{
                {1, 0, 1},
                {0, 1, 0},
                {1, 5, 1},
        };
        System.out.println(sumArray2d(array2dThird));
    }

    public static int sumArray2d(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[0].length)
                throw new RuntimeException("Массив не квадратный, размеры массива: [" + array.length +
                        " x " + array[i].length + "]");
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Элемент с индексами [" + i + ":"
                            + j + "] не равен 0 или 1, его значение: " + array[i][j]);
                }
                sum += array[i][j];
            }
        }
        return sum;
    }
}
