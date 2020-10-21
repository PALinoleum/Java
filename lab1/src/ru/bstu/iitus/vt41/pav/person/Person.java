package ru.bstu.iitus.vt41.pav.person;

import java.util.Scanner;

public abstract class Person {

    public String name;
    public int age;

    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        this.name = scanner.nextLine();
        System.out.println("Введите Возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.age;
    }

    public abstract String toString();
}