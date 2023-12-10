package seminars.seminar_03.task_03;

public class NullPointerArray extends NullPointerException{
    public NullPointerArray(int index) {
        super("Oбращение к пустому элементу в массиве запрещено, индекс элемента: " + index);
    }

    public NullPointerArray() {
        super("Oбращение к пустому элементу в массиве запрещено");
    }
}
