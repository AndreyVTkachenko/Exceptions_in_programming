package Moiseev.seminars.seminar_03.task_02;

import java.io.IOException;

public class Counter implements AutoCloseable {

    private Integer count = 0;

    public Integer getCount() throws IOException {
        isClose();
        return count;
    }

    public void add() throws IOException {
        isClose();
        count++;
    }

    @Override
    public void close() {
        count = null;
        System.out.println("Method close...");
    }

    public void isClose() throws IOException {
        if (count == null) {
            throw new IOException("Экземпляр закрыт");
        }
    }
}
