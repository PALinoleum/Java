package ru.bstu.iitus.vt41.pav.pers;

import ru.bstu.iitus.vt41.pav.Person;
import java.util.Scanner;

public class Employee extends Person{

    public String workbook;

    public void empInit(){
        this.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Номер трудовой книжки:");

        this.workbook = scanner.nextLine();

    }

    public String toString(){

        return "Имя: " + this.name + " Возраст: " + this.age + "\n" +
                "Трудовая книжка: " + this.workbook;
    }
}