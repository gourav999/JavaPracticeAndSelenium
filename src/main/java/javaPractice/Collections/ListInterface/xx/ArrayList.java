package javaPractice.Collections.ListInterface.xx;

import java.util.*;
import java.util.Stack;
import java.util.Iterator;

class TestJavaCollection1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        //Duplicate entries are allowed in arraylist.
        //non synchronized
        list.add("Ravi12");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi1");
        list.add("Ajay");
        System.out.println("ArrayList--=>"+list);
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Linkedlist is same like arraylist, but its faster and having 2D arrays. manipulation is faster
        LinkedList<String> ls=new LinkedList<String>();
        ls.add("Gourav");
        ls.add("Sourabh");
        ls.add("Anubha");
        ls.add("Anaysha");
        ls.add("Aradhya");
        System.out.println("LinkedList--=>"+ls);


        //Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.
        Vector<String> v=new Vector<String>();
        v.add("ANITA");
        v.add("NUTAN");
        v.add("SAntosh");
        v.add("anil");

        System.out.println("Vector--=>"+v);


    Stack<String> sc=new Stack<String>();//Creating Stack
    //The stack is the subclass of Vector.
    // It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

        sc.add("Ramesh");//Adding object in Stack
        sc.add("Suresh");
        sc.add("Aniket");
        sc.add("Rajni");
        sc.pop();//Removing the last one
        System.out.println("Stack--=>"+sc);
    //Traversing Stack through Iterator
    Iterator itr1=sc.iterator();
        while(itr1.hasNext()){
        System.out.println(itr1.next());
    }
}}