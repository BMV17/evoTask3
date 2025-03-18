package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя первого пользователя");
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        System.out.println("Введите возраст первого пользователя");
        int age1 = console.nextInt();
        User user1 = new User(name1, age1);

        System.out.println("Введите имя второго пользователя");
        Scanner scanner = new Scanner(System.in);
        String name2 = scanner.nextLine();
        System.out.println("Введите возраст второго пользователя");
        int age2 = scanner.nextInt();
        User user2 = new User(name2, age2);

        if(age1 > age2)
            System.out.println(user2);
        else if (age2 > age1)
            System.out.println(user1);
        else if (age1 == age2) {
            System.out.println("Пользователи одного возраста");
            System.out.println(user1);
            System.out.println(user2);
        }
    }
}
