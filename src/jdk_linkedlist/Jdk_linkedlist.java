package jdk_linkedlist;

import java.util.Scanner;

public class Jdk_linkedlist {
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;

// @author perseidexv, i love chips

        do {
            System.out.println("===== MAIN MENU =====");
            System.out.println("1 - Simple LinkedList");
            System.out.println("2 - Circular LinkedList");
            System.out.println("5 - Exit");
            System.out.print("Select an option: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1: {
                    List list = new List();
                    int opta;
                    do {
                        System.out.println("\n--- SIMPLE LINKEDLIST MENU ---");
                        System.out.println("1 - Insert at front ");
                        System.out.println("2 - Insert at end ");
                        System.out.println("3 - Insert at position");
                        System.out.println("4 - Delete at front ");
                        System.out.println("5 - Delete at end ");
                        System.out.println("6 - Delete by value");
                        System.out.println("7 - Back to main menu");

                        System.out.println("\nCurrent list:");
                        list.printListValues();

                        System.out.print("Choose an option: ");
                        opta = sc.nextInt();

                        switch (opta) {
                            case 1: 
                                System.out.println("---- Insert at front ----");
                                System.out.print("Enter value: ");
                                int frontValue = sc.nextInt();
                                list.insertAtFront(frontValue);
                                break;

                            case 2: 
                                System.out.println("---- Insert at end ----");
                                System.out.print("Enter value: ");
                                int endValue = sc.nextInt();
                                list.insertAtEnd(endValue);
                                break;

                            case 3: 
                                System.out.println("---- Insert at position ----");
                                System.out.print("Enter value: ");
                                int insertValue = sc.nextInt();
                                System.out.print("Enter position (0-based): ");
                                int posValue = sc.nextInt();
                                list.insertInto(insertValue, posValue);
                                break;

                            case 4: 
                                System.out.println("---- Delete at front ----");
                                list.deleteAtFront();
                                break;

                            case 5: 
                                System.out.println("---- Delete at end ----");
                                list.deleteAtEnd();
                                break;

                            case 6: 
                                System.out.println("---- Delete by value ----");
                                System.out.print("Enter value: ");
                                int deleteValue = sc.nextInt();
                                list.delete(deleteValue);
                                break;

                            case 7:
                                System.out.println("Returning to main menu...");
                                break;

                            default:
                                System.out.println("Invalid option.");
                                break;
                        }

                    } while (opta != 7);
                    break;
                }

                case 2: { 
                    CircularList circular = new CircularList();
                    int optb;
                    do {
                        System.out.println("\n--- CIRCULAR LINKEDLIST MENU ---");
                        System.out.println("1 - Insert at front ");
                        System.out.println("2 - Insert at end ");
                        System.out.println("3 - Insert at position");
                        System.out.println("4 - Delete at front ");
                        System.out.println("5 - Delete at end ");
                        System.out.println("6 - Delete by value");
                        System.out.println("7 - Back to main menu");

                        System.out.println("\nCurrent circular list:");
                        circular.printListValues();

                        System.out.print("Choose an option: ");
                        optb = sc.nextInt();

                        switch (optb) {
                            case 1: 
                                System.out.println("---- Insert at front (circular) ----");
                                System.out.print("Enter value: ");
                                int cFrontValue = sc.nextInt();
                                circular.insertAtFront(cFrontValue);
                                break;

                            case 2: 
                                System.out.println("---- Insert at end (circular) ----");
                                System.out.print("Enter value: ");
                                int cEndValue = sc.nextInt();
                                circular.insertAtEnd(cEndValue);
                                break;

                            case 3: 
                                System.out.println("---- Insert at position (circular) ----");
                                System.out.print("Enter value: ");
                                int cInsertValue = sc.nextInt();
                                System.out.print("Enter position (0-based): ");
                                int cPosValue = sc.nextInt();
                                circular.insertInto(cInsertValue, cPosValue);
                                break;

                            case 4: 
                                System.out.println("---- Delete at front (circular) ----");
                                circular.deleteAtFront();
                                break;

                            case 5: 
                                System.out.println("---- Delete at end (circular) ----");
                                circular.deleteAtEnd();
                                break;

                            case 6: 
                                System.out.println("---- Delete by value (circular) ----");
                                System.out.print("Enter value: ");
                                int cDeleteValue = sc.nextInt();
                                circular.delete(cDeleteValue);
                                break;

                            case 7:
                                System.out.println("Returning to main menu...");
                                break;

                            default:
                                System.out.println("Invalid option.");
                                break;
                        }

                    } while (optb != 7);
                    break;
                }

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        } while (opt != 5);

        sc.close();
    }
}
