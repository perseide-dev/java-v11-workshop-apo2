package jdk_linkedlist;

import java.util.Scanner;

public class Jdk_linkedlist {

    public static void main(String[] args) {

        int opt;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("List menu");
            System.out.println("Write an option");
            System.out.println("1-Simple linkedlist");
            System.out.println("2-Circula LinkedList");
            System.out.println("3-Double LinkedList");
            System.out.println("4-Circula Double LinkedList");
            System.out.println("5-Salir");

            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Simple linkedlist");
                    List list1 = new List();

                    break;
                case 2:
                    System.out.println("option 1");
                    break;
                case 3:
                    System.out.println("option 1");
                    break;
                case 4:
                    System.out.println("option 1");
                    break;
                case 5:
                    System.out.println("Godbye :3");
                    break;
                default:
                    System.out.println("you write correct option");
                    break;

            }
        } while (opt != 5);

    }

}
