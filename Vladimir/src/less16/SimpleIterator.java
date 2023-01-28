package src.less16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimpleIterator<E> {
    private E[] arrays;

    public static void main(String[] args) {


        Collection<Integer> list = new ArrayList<>();
        Iterator<Integer> iter = list.iterator();
        Iter iters = new Iter(list.toArray(new Integer[7]), 5);
        Dog dogs = new Dog();

        System.out.println(iter.hasNext());
        System.out.println(iters.next(2));
        System.out.println(iters.remove(3));
        System.out.println(iters.hasNext(1));
        System.out.println(dogs.findAll(dogs));
        System.out.println(iters.findAll(1, 2));


    }

}


