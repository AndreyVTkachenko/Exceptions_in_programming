package seminars.seminar_03.task_02;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1. Сделайте
так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Подумайте, что должно происходить
при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого
ресурса, должен выброситься IOException
*/

public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.getCount());
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            counter.close();
            System.out.println(counter.getCount());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

