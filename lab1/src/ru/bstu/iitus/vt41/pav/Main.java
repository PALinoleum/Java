package ru.bstu.iitus.vt41.pav;

import ru.bstu.iitus.vt41.pav.pers.emp.*;
import ru.bstu.iitus.vt41.pav.pers.*;
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