package dsa.objects;


import dsa.objects.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Demo {
    public static void main(String[] args) {
        List li = new List();
        
        li.addLast(10);
        li.addLast(20);
        li.addLast(30);
        li.addLast(40);
        li.addLast(50);
        // li.displayData(); // [10,20,30,40,50]
        
        li.add(2, 60);
        // li.displayData(); // [10,20,60,30,40,50]
        
        li.removeLast();
        // li.displayData(); // [10,20,60,30,40]
        
        li.remove(3);
        // li.displayData(); // [10,20,60,40]
        
        int index = li.indexOf(60);
        // System.out.println("Index of 60: "+index);
        
        // System.out.println("Is 50 remainded? "+li.contains(50));
        // System.out.println("Is 20 remainded? "+li.contains(20));
        
        li.set(2, 30);
        li.displayData(); // [10,20,30,40]
        
        int returnedData = li.get(1);
        System.out.println("Returned Data on Index 1: "+returnedData);
    }
}
