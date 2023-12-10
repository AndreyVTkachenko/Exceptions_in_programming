package seminars.seminar_03.task_04;

public class SumArray {
    public static int sumArray2d(String[][] array){
        if(array.length != 4 || array[0].length !=4 ) throw new MyArraySizeException(array.length, array[0].length);
        int sum = 0;
        for (String[] arr:array) {
            for (String i:arr) {
                try {
                    sum += Integer.parseInt(i);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException();
                }

            }
        }
        return sum;
    }
}
