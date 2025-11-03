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
        Stack intStack = new Stack();
        intStack.push(100);
        intStack.push(200);
        intStack.push(300);
        intStack.push(400);
        intStack.push(500);
        
        // intStack.displayData(); // [500,400,300,200,100]
        
        intStack.pop();
        // intStack.displayData(); // [400,300,200,100]
        
        int index = intStack.indexOf(300);
        // System.out.println("Index of 300: "+index);
        
        System.out.println(intStack.toArray());
        
//        Queue qu = new Queue();
//        qu.add(10);
//        qu.add(20);
//        
//        qu.displayData();
        
//        Stack st = new Stack();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        
//        // st.displayData(); // [50,40,30,20,10]
//        
//        st.pop();
//        st.displayData(); // [40,30,20,10]

    
        
//        List li = new List();
//        
//        li.addLast(10);
//        li.addLast(20);
//        li.addLast(30);
//        li.addLast(40);
//        li.addLast(50);
//        // li.displayData(); // [10,20,30,40,50]
//        
//        li.add(2, 60);
//        // li.displayData(); // [10,20,60,30,40,50]
//        
//        li.removeLast();
//        // li.displayData(); // [10,20,60,30,40]
//        
//        li.remove(3);
//        // li.displayData(); // [10,20,60,40]
//        
//        int index = li.indexOf(60);
//        // System.out.println("Index of 60: "+index);
//        
//        // System.out.println("Is 50 remainded? "+li.contains(50));
//        // System.out.println("Is 20 remainded? "+li.contains(20));
//        
//        li.set(2, 30);
//        li.displayData(); // [10,20,30,40]
//        
//        int returnedData = li.get(1);
//        System.out.println("Returned Data on Index 1: "+returnedData);
    }
}
