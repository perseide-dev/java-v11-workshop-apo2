/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk_linkedlist;

/**
 *
 * @author perseidexv
 */
public class CircularList {

    private Node head;

    public CircularList() {
        this.head = null;
    }

    public void shift(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.setLink(newNode);
            head = newNode;
        } else {
            Node tail = head;
            do {
                tail = tail.getLink();
            } while (tail.getLink() != head);
            tail.setLink(newNode);
            head = newNode;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.setLink(newNode);
            head = newNode;
        } else {
            Node tail = head;
            do {
                tail = tail.getLink();
            } while (tail.getLink() != head);
            tail.setLink(newNode);
            newNode.setLink(head);
        }
    }

    public void delte(int value) {
        if (head != null) {
            if (head.getLink() == head & head.getValue() == value) {
                head = null;
            }else{
                if (head.getValue() == value){
                    Node tail = head
                            do{
                                tail = tail.getLink();
                            }while(tail.getLink == head);
                            head = head.getLink();
                            tail.setLink(head);
                }else{
                    Node prev = head;
                    Node curr = head.getLink();
                    do{
                        if(curr.getValue() == value){
                            prev.setLink(curr.getLink());
                            break;
                        }
                        prev = curr;
                        curr = curr.getLink();
                    }while(curr != head);
                }
            }
        } 
    }

}
