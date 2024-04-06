package Makartsev.seminars.seminar_01.task_01;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
значение и покажет читаемый результат пользователю. Например, если вернулся -2,
пользователю выведется сообщение: “Искомый элемент не найден”.
*/

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6546, 45, 34};

        getText(getNumber(array, 3, 5));
        getText(getNumber(null, 4, 5));
        getText(getNumber(array, 10, 5));
        getText(getNumber(array, 5, 55));
    }

    public static int getNumber(int[] array, int min, int num) {

        if (array == null) {
            return -3;
        }
        if (array.length < min) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -2;
    }

    public static void getText(int code) {
        switch (code) {
            case -3:
                System.out.println("Массив пустой");
                break;
            case -1:
                System.out.println("Длина меньше минимума");
                break;
            case -2:
                System.out.println("Элемент не найден");
                break;
            default:
                System.out.println("Искомый элемент находится на индексе " + code);
                break;
        }
    }
}
