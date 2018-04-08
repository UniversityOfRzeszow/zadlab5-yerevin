/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Worker {

    public String name = "";
    public String surname = "";
    public int age = 0;
    public int salary = 0;
    Scanner input = new Scanner(System.in);

    public Worker(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public Worker() {
    }

    public Worker createWorker() {
        System.out.println("Podaj imie pracownika");
        this.name = input.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        this.surname = input.nextLine();
        System.out.println("Podaj wiek pracownika");
        this.age = input.nextInt();
        System.out.println("Ustal zarobki pracownika");
        this.salary = input.nextInt();
        return this;
    }

    public void displayWorkerData() {
        System.out.println("Imie pracownika " + name);
        System.out.println("Nazwisko pracownika " + surname);
        System.out.println("Wiek pracownika " + age);
        System.out.println("Zarobki pracownika " + salary);
    }

}
