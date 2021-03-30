package com.company;

public class Main {

    public static void main(String[] args) {

        int yearOfBirthday = 1986;
        int monthOfBirthday = 12;
        int dayOfBirthday = 8;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;

        System.out.println("Сумма моего года рождения: " + sum);

        boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;

        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);

        char[] array = new char[6];
        array[0] = 'a';
        array[1] = 'n';
        array[2] = 'd';
        array[3] = 'r';
        array[4] = 'e';
        array[5] = 'i';

        System.out.print("Vассив с моим именем: ");
        for (char item : array) {
            System.out.print(item);
        }
        System.out.println();

        double myAge = 34.0;
        double partYear = 3.0 / 12.0;
        double Age = myAge + partYear;

        System.out.println("Мне " + Age + " лет");


    }
}
