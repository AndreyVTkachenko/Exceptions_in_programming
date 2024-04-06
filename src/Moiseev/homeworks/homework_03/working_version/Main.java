package Moiseev.homeworks.homework_03.working_version;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Moiseev.homeworks.homework_03.working_version.DataEntryCheck.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> userData = new HashMap<>();

        System.out.println("Введите порядок номеров для ввода своих данных через запятую: ");
        System.out.println("1 - Фамилия Имя Отчество");
        System.out.println("2 - Дата рождения");
        System.out.println("3 - Номер телефона");
        System.out.println("4 - Пол");

        String userDataInput = scanner.nextLine();
        String[] userDataArray = userDataInput.split(",");

        for (String selectedNumber : userDataArray) {
            switch (selectedNumber.trim()) {
                case "1":
                    System.out.println("Введите фамилию, имя и отчество, разделяя их пробелом:");
                    String name = scanner.nextLine().toUpperCase();
                    while (!checkName(name)) {
                        System.out.println("Вы ввели некорректные данные! Попробуйте ещё раз.");
                        name = scanner.nextLine().toUpperCase();
                    }
                    userData.put("ФИО", name);
                    break;
                case "2":
                    System.out.println("Введите свою дату рождения в формате ДД.ММ.ГГГГ:");
                    String dateOfBirth = scanner.nextLine();
                    while (!checkDate(dateOfBirth)) {
                        System.out.println("Вы ввели некорректные данные своего дня рождения. Повторите попытку:");
                        dateOfBirth = scanner.nextLine();
                    }
                    userData.put("дата_рождения", dateOfBirth);
                    break;
                case "3":
                    System.out.println("Введите номер своего телефона в международном формате (11 цифр):");
                    String phoneNumber = scanner.nextLine();
                    while (!checkPhone(phoneNumber)) {
                        System.out.println("Вы ввели некорректный номер телефона! Повторите ввод:");
                        phoneNumber = scanner.nextLine();
                    }
                    userData.put("телефон", phoneNumber);
                    break;
                case "4":
                    System.out.println("Введите свой пол (мужской -> male, женский -> female):");
                    String gender = scanner.nextLine().toLowerCase();
                    while (!checkGender(gender)) {
                        System.out.println("Вы допустили ошибку при вводе пола. Попробуйте ещё раз.");
                        gender = scanner.nextLine().toLowerCase();
                    }
                    userData.put("пол", gender);
                    break;
                default:
                    System.out.println(
                            "Вы ввели неверный номер: " + userDataInput + ". Активируйте приложение заново.");
                    return;
            }
        }
        try {
            if (userData.size() != 4) {
                System.out.println("Вы ввели неверное количество данных! Активируйте приложение заново.");
                return;
            }

            String data = userData.get("ФИО").split(" ")[0];
            String fileName = "C:\\Users\\gepat\\Documents\\Обучение в GeekBrains\\Исключения в программировании и их" +
                    " обработка\\Exceptions in programming\\src\\Moiseev\\homeworks\\homework_03\\list_of_people\\"
                    + data + ".txt";
            FileWriter writer = new FileWriter(fileName, true);

            String name = userData.get("ФИО");

            String dateOfBirth = userData.get("дата_рождения");

            double phoneNumber = Double.parseDouble(userData.get("телефон"));

            String gender = userData.get("пол");


            String userDataLine = name + " " + dateOfBirth + " " + (long) phoneNumber + " " + gender + "\n";
            writer.write(userDataLine);
            writer.close();
            System.out.println("Данные записаны в папку list_of_people -> файл " + data + ".txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
