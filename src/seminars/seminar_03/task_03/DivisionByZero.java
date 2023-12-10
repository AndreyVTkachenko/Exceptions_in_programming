package seminars.seminar_03.task_03;

public class DivisionByZero extends ArithmeticException{
    public DivisionByZero() {
        super("Деление на 0 запрещено");
    }
}
