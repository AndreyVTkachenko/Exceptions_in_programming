package Moiseev.homeworks.homework_03.working_version;

import java.util.regex.Pattern;

public class DataEntryCheck {

    public static boolean checkName(String fio) {

        String[] nameParts = fio.split(" ");

        if (nameParts.length != 3) {
            return false;
        }

        for (String namePart : nameParts) {
            if (!namePart.matches("[a-zA-Zа-яА-Я\\-]+")) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkDate(String dateOfBirth) {

        boolean isValidDate = Pattern.matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d", dateOfBirth);
        if (!isValidDate) {
            return false;
        }

        String[] parts = dateOfBirth.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year < 1900 || year > 2023) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        }
        if (day < 1 || day > maxDay) {
            return false;
        }

        return true;
    }

    public static boolean checkPhone(String phone) {
        boolean isValidPhone;
        try {
            double phoneNumber = Double.parseDouble(phone);
            isValidPhone = true;
        } catch (NumberFormatException e) {
            isValidPhone = false;
        }
        if (phone.length() != 11) {
            isValidPhone = false;
        }
        return isValidPhone;
    }

    public static boolean checkGender(String gender) {
        boolean isValidGender = gender.equals("male") || gender.equals("female");
        return isValidGender;
    }
}

