package Moiseev.seminars.seminar_01.task_01;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки,
иначе - длину массива.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(arrayLength(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 5));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(arrayLength(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 20));
    }

    public static int arrayLength(int[] array, int minLengthArray) {
        if (array.length < minLengthArray) {
            return -1;
        } else {
            return array.length;
        }
    }
}
