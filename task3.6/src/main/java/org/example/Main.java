package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, List<User>> myHashMap = new HashMap<Integer, List<User>>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите имя пользователя " + i);
            Scanner console = new Scanner(System.in);
            String name = console.nextLine();
            System.out.println("Введите возраст пользователя " + i);
            int age = console.nextInt();
            User user = new User(name, age);

            if (!myHashMap.containsKey(age)) {
                myHashMap.put(age, new ArrayList<User>());
                List<User> value = myHashMap.get(age);
                value.add(new User(name, age));
                Collections.sort(value, Comparator.comparing( User :: getName));

            } else {
                List<User> value = myHashMap.get(age);
                value.add(new User(name, age));
                Collections.sort(value, Comparator.comparing( User :: getName));

            }
        }
            System.out.println("Введите требуемый возраст");
            Scanner scanner = new Scanner(System.in);
            int age2 = scanner.nextInt();

            if (myHashMap.containsKey(age2)){
                for (int i = 0; i < myHashMap.get(age2).size(); i++)
                    System.out.println(myHashMap.get(age2).get(i));
            }
            else
                System.out.println("Пользователь с возрастом ' " + age2 + " ' не найден");


        }
    }









