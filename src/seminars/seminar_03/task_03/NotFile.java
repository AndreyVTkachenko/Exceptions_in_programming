package seminars.seminar_03.task_03;

import java.io.FileNotFoundException;

public class NotFile extends FileNotFoundException {
    public NotFile(String path) {
        super("Открыть несуществующий файл нельзя, ваш путь к фалу -> " + path);
    }
    public NotFile() {
        super("Открыть несуществующий файл нельзя");
    }
}
