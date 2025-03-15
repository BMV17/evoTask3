package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> myArrayList = new ArrayList<User>();
        for(int i=1; i<=5; i++){
            System.out.println("Введите имя пользователя " + i);
            Scanner console = new Scanner(System.in);
            String name = console.nextLine();
            System.out.println("Введите возраст пользователя " + i);
            int age = console.nextInt();
            User user = new User(name, age);
            myArrayList.add(user);
        }
        Collections.sort(myArrayList, Comparator.comparing( User :: getAge));
        for(int j=0; j<5; j++) {
            System.out.println(myArrayList.get(j));
        }
    }

}
