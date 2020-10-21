package ru.bstu.iitus.vt41.pav.pers.emp;

import ru.bstu.iitus.vt41.pav.pers.Employee;
import java.util.Scanner;

public class Teacher extends Employee{

    private String license;

    public void teachInit(){
        this.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Номер трудовой книжки и Номер лицензии:");

        this.workbook = scanner.nextLine();
        this.license = scanner.nextLine();

    }

    public String toString(){

        return "Имя: " + this.name + " Возраст: " + this.age + "\n" +
                "Трудовая книжка: " + this.workbook + " Лицензия: " + this.license;
    }
}