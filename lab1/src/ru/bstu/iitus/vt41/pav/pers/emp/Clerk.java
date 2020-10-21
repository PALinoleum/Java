package ru.bstu.iitus.vt41.pav.pers.emp;

import ru.bstu.iitus.vt41.pav.pers.Employee;
import java.util.Scanner;

public class Clerk extends Employee {

    private String salary;

    public void clerkInit(){
        this.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Номер трудовой книжки и Размер зарплаты:");

        this.workbook = scanner.nextLine();
        this.salary = scanner.nextLine();

    }

    public String toString(){

        return "Имя: " + this.name + " Возраст: " + this.age + "\n" +
                "Трудовая книжка: " + this.workbook + " Зарплата: " + this.salary;
    }
}
