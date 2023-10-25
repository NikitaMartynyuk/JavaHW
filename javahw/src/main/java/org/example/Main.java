package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите данные (Фамилия Имя Отчество датарождения номертелефона пол): ");
        String userDataInput = scanner.nextLine();

        String[] userData = userDataInput.split(" ");

        try {
            if (userData.length != 6) {
                throw new IllegalArgumentException("Введено неверное количество данных");
            }

            String lastName = userData[0];
            String firstName = userData[1];
            String middleName = userData[2];
            String birthDate = userData[3];
            String phoneNumber = userData[4];
            String gender = userData[5];

            validateData(lastName, firstName, middleName, birthDate, phoneNumber, gender);

            writeFile(lastName, firstName, middleName, birthDate, phoneNumber, gender);

            System.out.println("Данные успешно записаны в файл");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: ");
            e.printStackTrace();
        }

        scanner.close();
    }

    public static void validateData(String lastName, String firstName, String middleName, String birthDate,
                                    String phoneNumber, String gender) throws IllegalArgumentException {
        String dateRegex = "\\d{2}.\\d{2}.\\d{4}";
        String phoneRegex = "\\d+";

        if (!birthDate.matches(dateRegex)) {
            throw new IllegalArgumentException("Неправильный формат даты рождения");
        }

        if (!phoneNumber.matches(phoneRegex)) {
            throw new IllegalArgumentException("Неправильный формат номера телефона");
        }

        if (!gender.equals("f") && !gender.equals("m")) {
            throw new IllegalArgumentException("Неправильный формат пола (допустимые значения: f или m)");
        }
    }

    public static void writeFile(String lastName, String firstName, String middleName, String birthDate,
                                 String phoneNumber, String gender) throws IOException {
        String filename = lastName + ".txt";

        FileWriter writer = new FileWriter(filename, true);
        writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
        writer.close();
    }

}