package Makartsev.seminars.seminar_03.task_01;

import java.io.IOException;

/*
Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвал метод doSomething().
 */

public class Main {
    public static void main(String[] args) {
        try{
            doSomething();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException{

    }
}
