package Makartsev.seminars.seminar_03.task_02;

import java.io.IOException;

public class Count implements AutoCloseable{
    private Integer count;

    public Count(){
        this.count = 0;
    }

    public void add() throws IOException{
        checkClose();
        this.count++;
    }

    public Integer getCount() throws IOException{
        checkClose();
        return count;
    }

    public void checkClose() throws IOException{
        if (this.count == null)
            throw new IOException("Экземпляр закрыт!");
    }

    @Override
    public void close(){
        this.count = null;
    }
}

