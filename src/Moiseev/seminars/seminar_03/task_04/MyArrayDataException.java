package Moiseev.seminars.seminar_03.task_04;

public class MyArrayDataException  extends NumberFormatException{
    public MyArrayDataException() {
        super("В каком-то элементе массива преобразование не удалось");
    }

    public MyArrayDataException(int i, int j) {
        super("Преобразование не удалось, индексы ->" + i + ":" + j);
    }
}
