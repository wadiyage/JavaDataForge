package dsa.objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class List {
    private Node first;
    
    public void addLast(int data) {
        add(size(), data);
    }
    
    public void addFirst(int data) {
        add(0, data);
    }
    
    public void add(int index, int data) {
        if(index>=0 && index<=size()) {
            Node newNode = new Node(data);
            if(index==0) {
                newNode.next=first;
                first=newNode;
            } else {
                int count=0;
                Node temp=first;
                while(count<index-1) {
                    count++;
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
    }
    
    private int size() {
        int count=0;
        Node temp=first;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public void displayData() {
        int count=0;
        Node temp=first;
        System.out.print("[");
        while(temp!=null) {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.print("\b]");
    }
    
    public void removeLast() {
        remove(size()-1);
    }
    
    public void removeFirst() {
        remove(0);
    }
    
    public void remove(int index) {
        if(index>=0 && index<size()) {
            if(index==0) {
                first=first.next;
            } else {
                int count=0;
                Node temp=first;
                while(count<index-1) {
                    count++;
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
    }
    
    public int indexOf(int data) {
        int count=0;
        Node temp=first;
        while(temp!=null) {
            if(temp.data==data) 
                return count;
            count++;
            temp=temp.next;
        }
        return -1;
    }
    
    public boolean contains(int data) {
        int count=0;
        Node temp=first;
        while(temp!=null) {
            if(temp.data==data) 
                return true;
            count++;
            temp=temp.next;
        }
        return false;
    }
    
    public void set(int index, int data) {
        if(index>=0 && index<size()) {
            Node newNode = new Node(data);
            if(index==0) {
                newNode.next=first.next;
                first=newNode;
            } else {
                int count=0;
                Node temp=first;
                while(count<index-1) {
                    count++;
                    temp=temp.next;
                }
                newNode.next=temp.next.next;
                temp.next=newNode;
            }
        }
    }
    
    public int get(int index) {
        int returnedData=0;
        if(index>=0 && index<size()) {
            if(index==0) {
                returnedData=first.data;
            } else {
                int count=0;
                Node temp=first;
                while(count<index-1) {
                    count++;
                    temp=temp.next;
                }
                returnedData=temp.next.data;
            }
        }
        return returnedData;
    }
    
    class Node {
        private int data;
        private Node next;
        
        Node(int data) {
            this.data=data;
        }
    }
}
