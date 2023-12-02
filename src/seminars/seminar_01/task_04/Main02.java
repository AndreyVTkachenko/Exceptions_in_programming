package seminars.seminar_01.task_04;

/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя;
если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”.
*/

public class Main02 {
    public static void main(String[] args) {
        checkArray(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("-----------------------------------------------------------------------------------------");
        checkArray(new Integer[]{1, 2, null, 4, 5, 6, 7, 8, null, 10});
    }

    public static void checkArray(Integer[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                stringBuilder.append(i).append(" ");
            }
        }
        if (!stringBuilder.isEmpty()) {
            throw new RuntimeException("Индексы null'ов: " + stringBuilder);
        }
    }
}
