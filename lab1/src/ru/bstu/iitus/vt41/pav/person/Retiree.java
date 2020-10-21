package ru.bstu.iitus.vt41.pav.person;

import java.util.Scanner;

public class Retiree extends Person{

    private String pension;

    public void retInit(){
        this.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Размер пенсии:");

        this.pension = scanner.nextLine();

    }

    public String toString(){

        return "Имя: " + this.name + " Возраст: " + this.age + "\n" +
                "Размер пенсии: " + this.pension;
    }
}
