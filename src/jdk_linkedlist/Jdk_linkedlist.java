package jdk_linkedlist;

import java.util.Scanner;

public class Jdk_linkedlist {

    public static void main(String[] args) {

        int opt;
        int opta;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("List menu");
            System.out.println("Write an option");
            System.out.println("1-Simple linkedlist");
            System.out.println("2-Circula LinkedList");
            System.out.println("3-Double LinkedList");
            System.out.println("4-Circula Double LinkedList");
            System.out.println("5-Exit");

            opt = sc.nextInt();
            switch (opt) {
                case 1:

                    do {
                        Scanner sca = new Scanner(System.in);
                        System.out.println("Simple linkedlist");
                        System.out.println("List menu");
                        System.out.println("Write an option");
                        System.out.println("1-Push");
                        System.out.println("2-Shift");
                        System.out.println("3-Insert Max");
                        System.out.println("4-Insert Min");
                        System.out.println("5-Insert");
                        System.out.println("6-unShift");
                        System.out.println("7-Pop");
                        System.out.println("8-Delete");
                        System.out.println("9-Exit");

                        opta = sca.nextInt();

                        switch (opta) {
                            case 1:
                                System.out.println("Push");
                                break;

                            case 2:
                                System.out.println("Shift");
                                break;

                            case 3:
                                System.out.println("Insert Max");
                                break;

                            case 4:
                                System.out.println("Insert Min");
                                break;

                            case 5:
                                System.out.println("Insert");
                                break;

                            case 6:
                                System.out.println("Unshift");
                                break;

                            case 7:
                                System.out.println("Pop");
                                break;

                            case 8:
                                System.out.println("Delete");
                                break;

                            case 9:
                                System.out.println("Go to main menu :3");
                                break;
                                
                            default:
                                System.out.println("you write correct option");
                                break;
                        }

                    } while (opta != 9);
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
