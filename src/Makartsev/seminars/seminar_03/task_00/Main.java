package Makartsev.seminars.seminar_03.task_00;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

    }

    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try(BufferedReader in = new BufferedReader((Reader) pathRead);
            BufferedWriter out = new BufferedWriter((Writer) pathWrite)){
            out.write(in.readLine());
        }catch (IOException e){
            System.out.println("Произошла ошибка при работе с файлом.");
        }
    }
}
