package ru.bstu.iitus.vt41.pav;
import java.util.Scanner;


//ВТ-41 Подкопаев Антон Лабораторная №1
public class Main {

    public static void main(String[] args) {

        Student st;
        Retiree rt;
        Teacher th;
        Clerk cl;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей");
        int n = scanner.nextInt();
        scanner.nextLine();

        Person[] people = new Person[n];

        int bestAge, currentAge;
        int bestPerson = 0;
        bestAge = 100;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите тип персоны");
            String type = scanner.nextLine();
            switch (type) {
                case  ("Студент"):
                    st = new Student();
                    st.studInit();
                    people[i] = st;
                    break;
                case ("Пенсионер"):
                    rt = new Retiree();
                    rt.retInit();
                    people[i] = rt;
                    break;
                case ("Учитель"):
                    th = new Teacher();
                    th.teachInit();
                    people[i] = th;
                    break;
                case ("Секретарь"):
                    cl = new Clerk();
                    cl.clerkInit();
                    people[i] = cl;
                    break;
                default:
                    System.out.println("Нет соответствующей персоны");
                    break;
            }
            currentAge = people[i].getWeight();
            if(currentAge < bestAge){
                bestAge = currentAge;
                bestPerson = i;
            }
        }

        System.out.println("\nСамый легкий человек:");
        System.out.println(people[bestPerson].toString());
    }
}

abstract class Person {

    public String name;
    public int age;

    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Последовательно ведите Имя и Возраст:");

        this.name = scanner.nextLine();
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

class Student extends Person{

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

class Retiree extends Person{

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

class Employee extends Person{

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

class Teacher extends Employee{

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

class Clerk extends Employee{

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