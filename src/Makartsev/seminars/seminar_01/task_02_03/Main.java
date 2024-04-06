package Makartsev.seminars.seminar_01.task_02_03;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее
сообщение пользователю.
 */

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{0, 1, 0}, {1, 2, 0}, {0, 0, 1}};
        int[][] matrix2 = {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}};
        int[][] matrix3 = null;
        int[][] matrix4 = {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}, {1, 0, 1}};

        getText(sumElements(matrix1));
        getText(sumElements(matrix2));
        getText(sumElements(matrix3));
        getText(sumElements(matrix4));
    }

    public static void getText(int code) {
        switch (code) {
            case -3:
                System.out.println("Элементы отличные от 0 и 1");
                break;
            case -1:
                System.out.println("Массив пустой");
                break;
            case -2:
                System.out.println("Массив не квадратный");
                break;
            default:
                System.out.println("Сумма элементов массива равна " + code);
                break;
        }
    }

    public static int sumElements(int[][] matrix){
        if (matrix == null)
            return -1;
        if (matrix.length != matrix[0].length)
            return -2;
        int resultSum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != 0 && matrix[i][j] != 1)
                    return -3;
                resultSum += matrix[i][j];
            }
        }
        return resultSum;
    }
}
