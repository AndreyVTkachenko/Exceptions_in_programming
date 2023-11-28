package lessons.lesson_01;

public class Application02 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Нельзя делить на ноль!");
        }
        return a / b;
    }
}
