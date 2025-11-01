/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.objects;

/**
 *
 * @author Dell
 */
public class Stack {
    private Node top;
    
    
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
    }
    
    private boolean isEmpty() {
        return top==null;
    }
    
    private int size() {
        int count=0;
        Node temp=top;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public void displayData() {
        Node temp=top;
        System.out.print("[");
        while(temp!=null) {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.print("\b]");
    }
    
    public void pop() {
        if(!isEmpty())
            top=top.next;
    }
    
    
    class Node {
        private int data;
        private Node next;
        
        Node(int data) {
            this.data=data;
        }
    }
}
