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
public class Stack {

    public int stackPointer = 0;
    public int[] stack;
    public int stackLength;
    Scanner input = new Scanner(System.in);

    public Stack(int n) {
        this.stackLength = n;
        this.stack = new int[n];
    }

    public void push() {
        if (stackPointer < stackLength) {
            System.out.print("Podaj liczbe, ktora chcesz dodac na stos: ");
            stackPointer++;
            stack[stackPointer] = input.nextInt();
        } else {
            System.out.println("Stos pelny");
        }
    }

    public void pop() {
        if (stackPointer >= 1) {
            System.out.println("Usuwam element ze stosu");
            stack[stackPointer] = 0;
            stackPointer--;
        } else {
            System.out.println("Stos jest pusty");
        }
    }

    public void displayStack() {
        System.out.println("Stos: ");
        for (int i = stackPointer; i >= 1; i--) {
            System.out.println(stack[i]);
        }
    }

}
