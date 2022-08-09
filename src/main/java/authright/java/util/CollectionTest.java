package authright.java.util;

import java.util.*;
import java.util.function.Consumer;

public class CollectionTest implements Iterable {
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }


    public void testArrayList(){
        List<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
// when will we have error case?
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list1.add("test4");
        list1.add("test2");

        list2.add("test1");
        System.out.println("first index of test2: "+list1.indexOf("test2"));
        System.out.println("last index of test2: "+list1.lastIndexOf("test2"));

        list1.set(list1.lastIndexOf("test2"), "test5");

        List<String> sublist1 = list1.subList(2,4);

//        try the difference with List and ArrayList;
//        list1.trimToSize;
        list2.trimToSize();
        Iterator itr = list1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(list1.get(1));
        System.out.println("sublist: ");
        for (String a : sublist1){
            System.out.println(a);
        }
    }


    public void testQueue() {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        System.out.println("Amit Sharma".compareTo("Raj"));
        System.out.println("Vijay Raj".compareTo("Raj"));
        System.out.println("JaiShankar".compareTo("Raj"));
        queue.add("1");
        queue.add("4");
        queue.add("3");
        queue.add("2");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }



}
