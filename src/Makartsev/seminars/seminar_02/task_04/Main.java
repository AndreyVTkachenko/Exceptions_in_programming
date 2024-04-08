package Makartsev.seminars.seminar_02.task_04;

import java.io.*;

public class Main {
    public static void main(String[] args){
        InputStream inputStream;
        String[] strings = {"asdf", "asdf"};
        try{
            String strings1 = strings[2];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }
        try{
            test();
        }
        catch (Throwable error){
            error.printStackTrace();
        }
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        try{
            inputStream = new FileInputStream("asdfsdasa");
        }
        catch (IOException e){
            System.out.println("фвфывфывфыв");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException{
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
