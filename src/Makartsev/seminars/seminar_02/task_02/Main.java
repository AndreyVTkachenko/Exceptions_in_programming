package Makartsev.seminars.seminar_02.task_02;

public class Main {
    public static void main(String[] args){
        String[][] arr = {{"1", "2"}, {"a", "3"}};
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int val = 0;
                try{
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    System.out.println("Невозможно перевести элемент в целое число, находящийся на позиции -> " +
                            "(" + i + ", " + j + ")");
                }
                sum += val;
            }
        }
        return sum;
    }
}
