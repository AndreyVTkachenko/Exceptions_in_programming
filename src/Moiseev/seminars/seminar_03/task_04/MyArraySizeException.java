package Moiseev.seminars.seminar_03.task_04;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int row, int colum) {
        super("Массив должен быть 4х4, размеры вашего массив -> " + row + "x" + colum );
    }

    public MyArraySizeException() {
        super("Массив должен быть 4х4");
    }
}
