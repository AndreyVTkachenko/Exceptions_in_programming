package seminars.seminar_01.task_02;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве
заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки;
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки;
если вместо массива пришел null, метод вернет -3.
Придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у
пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
*/

public class Main {
    public static void main(String[] args) {
        arrayMessage(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 20, 1);
        System.out.println("-----------------------------------------------------------------------------------------");
        arrayMessage(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 5, 729);
        System.out.println("-----------------------------------------------------------------------------------------");
        arrayMessage(null, 8, 1);
        System.out.println("-----------------------------------------------------------------------------------------");
        arrayMessage(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 10, 6);
    }

    public static int arrayMethods(int[] array, int minLengthArray, int number) {
        if (array == null) {
            return -3;
        } else if (array.length < minLengthArray) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return i;
                }
            }
        }
        return -2;
    }

    public static void arrayMessage(int[] array, int minLengthArray, int number) {
        int result = arrayMethods(array, minLengthArray, number);
        switch (result) {
            case -1:
                System.out.println("Длина массива меньше заданного минимума: " + minLengthArray);
                break;
            case -2:
                System.out.println("Искомый элемент: " + number + " не найден.");
                break;
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            default:
                System.out.println("Индекс искомого элемента: " + result);
        }
    }
}
