package seminars.seminar_02.task_01;

/*
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты с ним
знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение "?", заменить его на
соответствующее число. Если на каком-то месте встречается символ, отличный от числа или "?", бросить подходящее
исключение. Записать в тот же файл данные с замененными символами "?".
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String patch = "C:\\Users\\gepat\\Documents\\Обучение в GeekBrains\\Исключения в программировании и их " +
                "обработка\\Exceptions in programming\\src\\seminars\\seminar_02\\task_01\\file.txt";
        List<String[]> arrayNames = readFile(patch);
        upArray(arrayNames);
        writeFile(patch, arrayNames);
    }

    public static List<String[]> readFile(String patch){
        List<String[]> arrayNames = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(patch))) {

            String line;
            while ((line = reader.readLine()) != null){
                arrayNames.add(line.split("="));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return arrayNames;
    }

    public static void upArray(List<String[]> arrayNames){
        for (String[] i : arrayNames) {
            if(!i[1].equals("?") && !checkString(i[1])){
                throw new IllegalArgumentException("Элемент не ? и не число");
            }
            i[1] = String.valueOf(i[0].length());
        }
    }

    public static boolean checkString(String value){
        try {
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void writeFile(String patch, List<String[]> arrayNames){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(patch));
            for (String[] i : arrayNames ) {
                writer.write(i[0] + "=" + i[1] + "\n");
            }
            System.out.println("Результат перезаписан в файл file.txt");
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}