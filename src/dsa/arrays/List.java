/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.arrays;

/**
 *
 * @author Dell
 */
public class List {
    private int[] dataArr;
    private int nextIndex;
    private double loadFact;
    private final int initSize;
    public List(int initSize, double loadFact) {
        this.initSize=initSize;
        dataArr = new int[this.initSize];
        nextIndex=0;
        this.loadFact=loadFact;
    }
    
    public void addLast(int data) {
        add(nextIndex, data);
    }
    
    public void addFirst(int data) {
        add(0, data);
    }
    
    public void add(int index, int data) {
        if(index>=0 && index<=nextIndex) {
            if(isFull()) {
                extendsArray();
            }
            for(int i=nextIndex;i>index;i--) {
                dataArr[i]=dataArr[i-1];
            }
            dataArr[index]=data;
            nextIndex++;
        }
    }
    
    private boolean isFull() {
        return nextIndex>=dataArr.length;
    }
    
    private void extendsArray() {
        int[] tempDataArr = new int[dataArr.length+1];
        for(int i=0;i<dataArr.length;i++) {
            tempDataArr[i]=dataArr[i];
        }
        dataArr=tempDataArr;
    }
    
    public void displayDataArray() {
        System.out.print("[");
        for(int i=0;i<nextIndex;i++) {
            System.out.print(dataArr[i]+",");
        }
        System.out.print("\b]");
    }
    
    public void removeLast() {
        remove(nextIndex-1);
    }
    
    public void removeFirst() {
        remove(0);
    }
    
    public void remove(int index) {
        if(index>=0 && index<nextIndex) {
            if(!isEmpty()) {
                for(int i=index;i<nextIndex-1;i++) {
                    dataArr[i]=dataArr[i+1];
                }
                nextIndex--;
            }
        }
    }
    
    private boolean isEmpty() {
        return nextIndex==0;
    }
    
    
}
