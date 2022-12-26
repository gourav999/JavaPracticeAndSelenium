package javaPractice.Collections.ListInterface.xx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class SetInterface {
    //Set Interface
    //Set Interface in Java is present in java.util package.
    //It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items.
    //We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Gourav");
        hs.add("Gourav");
        hs.add("Sourabh");
        hs.add("Anu");
        hs.add("Aaru");
        System.out.println("Hashset-->"+hs);
        for(String str:hs){ System.out.println("Hashset value-->"+str);
        }



     //Imp: It maintain the insertion order
    //Linkedhashset
    //LinkedHashSet class represents the LinkedList implementation of Set Interface. It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.
    LinkedHashSet<String>lhs=new LinkedHashSet<String>();
    lhs.add("Santosh");
        lhs.add("Santosh");
        lhs.add("Anita");
        lhs.add("Anubha");
        lhs.add("Prachi");

        Iterator<String> itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.println("LinkedHashset-->"+itr.next());
        }


    //Sorted Set interface
    //it uses tree set
    //no duplicate. ascdening order
    TreeSet<String>ts=new TreeSet<String>();
        ts.add("Gourav");
        ts.add("Anil");
        ts.add("Zenith");
        for(String str:ts){
            System.out.println("Treeset/sortedset Interface-->"+str);
        }


}
}
