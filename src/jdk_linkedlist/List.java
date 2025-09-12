/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk_linkedlist;

/**
 *
 * @author perseidexv
 */
public class List {
    private Node head;

    public List() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    
    public void unShift(int value)
    {
        Node x = new  Node(value);
        if(head != null){
            x.setLink(head);
        };
        head = x;
    }
    
    public void push(int value)
    {
        Node x = new  Node(value);
        Node p = head;
        if(head == null)
        {
            head = x;
        }
        else 
        {
            while(p.getLink() == null)
            {
                p = p.getLink();
            }
            p.setLink(x);
        }
    }
    
    public void printListValues(){
        
        Node p = head;
        
        if(p == null)
        {
            System.out.println("empty list");
        }
        while(p != null)
        {
            System.out.println(p.getValue());
            p = p.getLink();
        }
    }
    
}
