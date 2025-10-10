package jdk_linkedlist;

import java.util.Scanner;

public class Jdk_linkedlist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // un solo Scanner
        int opt;

        do {
            System.out.println("List menu");
            System.out.println("Write an option");
            System.out.println("1-Simple LinkedList");
            System.out.println("2-Circular LinkedList");
            System.out.println("3-Double LinkedList");
            System.out.println("4-Circular Double LinkedList");
            System.out.println("5-Exit");
            opt = sc.nextInt();

            switch (opt) {
                case 1: {
                    // Crear la lista UNA SOLA VEZ para todo el submenú
                    List list = new List();
                    int opta;
                    do {
                        System.out.println("\nSimple LinkedList (current):");
                        list.printListValues();

                        System.out.println("\nList submenu");
                        System.out.println("1-Push (append at end)");
                        System.out.println("2-Shift (remove first)");
                        System.out.println("3-Insert Max (TODO)");
                        System.out.println("4-Insert Min (TODO)");
                        System.out.println("5-Insert (TODO)");
                        System.out.println("6-unShift (insert at head)");
                        System.out.println("7-Pop (remove last)");
                        System.out.println("8-Delete (TODO)");
                        System.out.println("9-Exit submenu");

                        opta = sc.nextInt();

                        switch (opta) {
                            case 1: // push
                                System.out.println("----Push----");
                                System.out.print("Write value to push: ");
                                int pushValue = sc.nextInt();
                                list.push(pushValue);
                                System.out.println("List after push:");
                                list.printListValues();
                                break;

                            case 6: // unShift
                                System.out.println("----unShift----");
                                System.out.print("Write value to unShift: ");
                                int unshiftValue = sc.nextInt();
                                list.unShift(unshiftValue);
                                System.out.println("List after unShift:");
                                list.printListValues();
                                break;

                            case 2: // Shift (ejemplo simple)
                                System.out.println("----Shift (remove first)----");
                                if (list.getHead() == null) {
                                    System.out.println("Empty list");
                                } else {
                                    list.setHead(list.getHead().getLink());
                                    list.printListValues();
                                }
                                break;

                            case 7: // Pop (remove last) ejemplo simple
                                System.out.println("----Pop (remove last)----");
                                if (list.getHead() == null) {
                                    System.out.println("Empty list");
                                } else if (list.getHead().getLink() == null) {
                                    list.setHead(null);
                                    System.out.println("List is now empty");
                                } else {
                                    var p = list.getHead();
                                    while (p.getLink().getLink() != null) {
                                        p = p.getLink();
                                    }
                                    p.setLink(null);
                                    list.printListValues();
                                }
                                break;

                            case 3:
                            case 4:
                            case 5:
                            case 8:
                                System.out.println("Option not implemented yet.");
                                break;

                            case 9:
                                System.out.println("Back to main menu.");
                                break;

                            default:
                                System.out.println("Please write a correct option.");
                                break;
                        }

                    } while (opta != 9);
                    break;
                }

                case 2:
                case 3:
                case 4:
                    System.out.println("Option not implemented yet.");
                    break;

                case 5:
                    System.out.println("Goodbye :3");
                    break;

                default:
                    System.out.println("Please write a correct option.");
                    break;
            }
        } while (opt != 5);

        sc.close();
    }
}