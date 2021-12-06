package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        tasks();
    }

    public static void tasks() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        //задание 1
        System.out.println(fullName);

        //задание 2
        System.out.println(fullName.toUpperCase(Locale.ROOT));

        //задание 3
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);

        //задание 4

        fullName = "Иванов Семён Семёнович";

        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
