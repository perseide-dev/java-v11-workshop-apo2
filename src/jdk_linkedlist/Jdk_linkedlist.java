package jdk_linkedlist;

import java.util.Scanner;

public class Jdk_linkedlist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;

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
                        System.out.println("1 - Insert at front (unShift)");
                        System.out.println("2 - Insert at end (Push)");
                        System.out.println("3 - Insert at position");
                        System.out.println("4 - Delete at front (Shift)");
                        System.out.println("5 - Delete at end (Pop)");
                        System.out.println("6 - Delete by value");
                        System.out.println("7 - Back to main menu");

                        System.out.println("\nCurrent list:");
                        list.printListValues();

                        System.out.print("Choose an option: ");
                        opta = sc.nextInt();

                        switch (opta) {
                            case 1: // unShift (insert at head)
                                System.out.println("---- Insert at front ----");
                                System.out.print("Enter value: ");
                                int frontValue = sc.nextInt();
                                list.insertAtFront(frontValue);
                                break;

                            case 2: // Push (append at end)
                                System.out.println("---- Insert at end ----");
                                System.out.print("Enter value: ");
                                int endValue = sc.nextInt();
                                list.insertAtEnd(endValue);
                                break;

                            case 3: // Insert at position
                                System.out.println("---- Insert at position ----");
                                System.out.print("Enter value: ");
                                int insertValue = sc.nextInt();
                                System.out.print("Enter position (0-based): ");
                                int posValue = sc.nextInt();
                                list.insertInto(insertValue, posValue);
                                break;

                            case 4: // Shift (remove first)
                                System.out.println("---- Delete at front ----");
                                list.deleteAtFront();
                                break;

                            case 5: // Pop (remove last)
                                System.out.println("---- Delete at end ----");
                                list.deleteAtEnd();
                                break;

                            case 6: // Delete by value
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

                case 2:
                    System.out.println("Circular LinkedList not fully implemented yet.");
                    break;

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
