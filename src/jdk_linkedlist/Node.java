/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk_linkedlist;

/**
 *
 * @author perseidexv
 */
public class Node {
   private  int value;
   private  Node link;       
    
    public Node(int value){
        this.value = value;
        this.link = null;
    }
    
   public void setValue(int value){
        this.value = value ;
    }
    
    public void setLink(Node link){
        this.link = link;
    }

    public Node getLink() {
        return link;
    }

    public int getValue() {
        return value;
    }
    
    
    
    
}
