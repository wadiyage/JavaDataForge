/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.objects;

/**
 *
 * @author Dell
 */
public class Queue {
    private Node front;
    
    public void add(int data) {
        Node newNode = new Node(data);
        if(front==null) {
            front=newNode;
        } else {
            Node lastNode=front;
            while(lastNode!=null) {
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
    } 
    
    public void displayData() {
        Node lastNode=front;
        System.out.print("[");
        while(lastNode!=null) {
            System.out.print(lastNode.data+",");
            lastNode=lastNode.next;
        }
        System.out.print("\b]");
    }
    
    public void remove() {
        if(!isEmpty()) {
            front=front.next;
        }
    }
    
    private boolean isEmpty() {
        return front==null;
    }
    
    class Node {
        private int data;
        private Node next;
        
        Node(int data) {
            this.data=data;
        }
    }
}
