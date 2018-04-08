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
public class Firm {

    public Worker workers[];
    Scanner input = new Scanner(System.in);

    public Firm() {
        this.workers = new Worker[100];
    }

    public Worker[] getWorkers() {
        return this.workers;
    }

    public void displayWorkers() {
        for (int i = 0; i < this.workers.length; i++) {
            if (this.workers[i] != null) {
                System.out.println(this.workers[i].name);
                System.out.println(this.workers[i].surname);
                System.out.println(this.workers[i].age);
                System.out.println(this.workers[i].salary);
            } else {
                break;
            }

        }
    }

    public void addWorker(Worker worker, int index) {
        this.workers[index] = worker;
    }

    public void changeWorkerData(int index) {
        System.out.println("Zmien imie pracownika");
        this.workers[index].name = input.nextLine();
        System.out.println("Zmien nazwisko pracownika");
        this.workers[index].surname = input.nextLine();
        System.out.println("Zmien wiek pracownika");
        this.workers[index].age = input.nextInt();
        System.out.println("Zmien zarobki pracownika");
        this.workers[index].salary = input.nextInt();
    }
}
