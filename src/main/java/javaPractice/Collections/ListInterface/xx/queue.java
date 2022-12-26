package javaPractice.Collections.ListInterface.xx;

import java.util.*;

class queue {
    //Queue interface maintains the first-in-first-out order.
    //It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

    public static void main(String args[]) {
        PriorityQueue<String>pq=new PriorityQueue<String>();
        pq.add("Gourav");
        pq.add("Sourabh");
        pq.add("anita");
        pq.add("santosh");
        System.out.println("All elements of queue-->"+pq);
       System.out.println("head-->"+pq.element());
        System.out.println("head-->"+pq.peek());
        Iterator itr=pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        pq.remove();//removing the first element
        System.out.println("after removing the first element, All elements of queue-->"+pq);
        pq.poll();
        System.out.println("Again after removing the element, All elements of queue-->"+pq);
        Iterator itr1=pq.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

//Deque
        //Deque interface extends the Queue interface.
        // In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the end
        //ArrayDeque
        //ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
        //ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
        Deque<String>dq=new ArrayDeque<String>(); {
            dq.add("Gourav");
            dq.add("Sourabh");
            dq.add("anita");
            for(String str:dq){
                System.out.println(str);
            }
        }
    }
}

