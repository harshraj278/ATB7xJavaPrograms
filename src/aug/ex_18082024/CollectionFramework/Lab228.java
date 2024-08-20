package aug.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab228 {
    public static void main(String[] args) {
        // Collections Framework
        // Collection - Interface
        // Collection(I) -> List (I)
        // List (I) -> ArrayList, LinkedList, Vector, Stack

        // Shopping List, Marks List, Collection of items, Todo List, Student List.
//        Collection mylist3 = new ArrayList(); //  Dynamic Dispatch
//        List mylist = new ArrayList(); //  Dynamic Dispatch

        List mylist2 = new ArrayList();
        mylist2.add("Pramod");
        mylist2.add("Amit");
        mylist2.add("Lucky");
        mylist2.add("Muthu");
        mylist2.add(123);
        mylist2.add(true);

        System.out.println(mylist2);// [Pramod, Amit, lucky, Muthu]
        System.out.println(mylist2.size()); // 6
        System.out.println(mylist2.contains("Amit")); // true
        System.out.println(mylist2.contains("Hemalata")); // False
        System.out.println(mylist2.get(1));

        String s1 = (String) mylist2.get(2);
        System.out.println(s1);
    }
}
