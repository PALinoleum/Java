package ru.bstu.iitus.vt41.pav.pers;

import ru.bstu.iitus.vt41.pav.Person;
import java.util.Scanner;

public class Student extends Person{

    private String gradebook;

    public void studInit(){
        this.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Номер зачетки:");

        this.gradebook = scanner.nextLine();

    }

    public String toString(){

        return "Имя: " + this.name + " Возраст: " + this.age + "\n" +
                "Номер зачетки: " + this.gradebook;
    }
}