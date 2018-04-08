package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz nr zadania: 3, 5, 6");
        int taskNumber = input.nextInt();
        switch (taskNumber) {
            case 3: {
                System.out.println("Podaj dlugosc stosu: ");
                int stackLength = input.nextInt();
                Stack stack = new Stack(stackLength);
                int subTaskNumber;
                do {
                    System.out.println("1.Dodaj liczbe \n 2.Usun liczbe \n 3.Wyswietl stos \n 4.Zakoncz program");
                    subTaskNumber = input.nextInt();
                    switch (subTaskNumber) {
                        case 1:
                            stack.push();
                            break;
                        case 2:
                            stack.pop();
                            break;
                        case 3:
                            stack.displayStack();
                            break;
                    }
                } while (subTaskNumber != 4);
                break;
            }
            case 5: {
                Worker worker = new Worker();
                Firm firm = new Firm();
                System.out.println("Podaj ilu pracownikow chcesz dodac:");
                int numberOfWorkersToAdd = input.nextInt();
                for (int i = 0; i < numberOfWorkersToAdd; i++) {
                    System.out.println("Pracownik nr: " + (i + 1));
                    firm.addWorker(worker.createWorker(), i);
                }
                firm.displayWorkers();
                break;
            }
            case 6: {
                System.out.print("Podaj liczbe");
                int userInputNumber = input.nextInt();
                Number number = new Number(userInputNumber);
                System.out.print("Przez jaka liczbe pomonozyc: ");
                int userMultiplingNumber = input.nextInt();
                number.multipling(userMultiplingNumber);
                System.out.println("Silnia x podanej liczby to: " + number.silnia(userInputNumber));
                number.display();
                break;
            }
            default: {
                System.out.println("nie ma takiego zadania");
                break;
            }
        }
    }

}
