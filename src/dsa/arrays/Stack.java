/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.arrays;

/**
 *
 * @author Dell
 */
public class Stack {
    private int[] dataArr;
    private int nextIndex;
    
    public Stack() {
        dataArr = new int[0];
        nextIndex=0;
    }
    
    public void push(int data) {
        if(isFull()) {
            extendsArray();
        }
        dataArr[nextIndex++]=data;
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
    
    public int pop() {
        if(!isEmpty())
            return dataArr[--nextIndex];
        else 
            return -1;
    }
    
    private boolean isEmpty() {
        return nextIndex==0;
    }
    
    
//    private int[] dataArr;
//    public Stack() {
//        dataArr = new int[0];
//    }
//    
//    public void push(int data) {
//        extendsArray();
//        dataArr[dataArr.length-1]=data;
//    }
//    
//    private void extendsArray() {
//        int[] tempDataArray = new int[dataArr.length+1];
//        for(int i=0;i<dataArr.length;i++) {
//            tempDataArray[i]=dataArr[i];
//        }
//        dataArr=tempDataArray;
//    }
//    
//    public void displayDataArray() {
//        System.out.print("[");
//        for(int i=0;i<dataArr.length;i++) {
//            System.out.print(dataArr[i]+",");
//        }
//        System.out.print("\b]");
//    }
//    
//    public int pop() {
//        int removedData = dataArr[dataArr.length-1];
//        int[] tempDataArray = new int[dataArr.length-1];
//        for(int i=0;i<tempDataArray.length;i++) {
//            tempDataArray[i]=dataArr[i];
//        }
//        dataArr=tempDataArray;
//        return removedData;
//    }
}
