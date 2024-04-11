package Makartsev.seminars.seminar_03.task_02;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, если работа с объектом типа счетчик была не в ресурсном try
и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
лучше всего.
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        try(Count ct = new Count()){
            ct.add(); // 1
            ct.add(); // 2
            ct.add(); // 3
            System.out.println(ct.getCount()); // count = 3
            ct.close(); // count = null
            ct.add(); // null + 1 -> ERROR
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
