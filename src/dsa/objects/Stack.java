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
        if(top==null) {
            top=newNode;
        } else {
            newNode.next=top;
            top=newNode;
        }
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
        if(!isEmpty()) {
            top=top.next;
        }
    }
    
    private boolean isEmpty() {
        return top==null;
    }
    
    public int indexOf(int data) {
        int index=size()-1;
        Node temp=top;
        while(temp!=null) {
            if(temp.data==data)
                return index;
            index--;
            temp=temp.next;
        }
        return -1;
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
    
    public boolean contains(int data) {
        int index=size()-1;
        Node temp=top;
        while(temp!=null) {
            if(temp.data==data)
                return true;
            index--;
            temp=temp.next;
        }
        return false;
    }
    
    public String toArray() {
        String toArray="[";
        Node temp=top;
        for(int i=size()-1;i>=0;i--) {
            toArray+=temp.data+",";
            temp=temp.next;
        }
        return toArray+"\b]";
    }
    
    
    class Node {
        private int data;
        private Node next;
        
        Node(int data) {
            this.data=data;
        }
    }
}
