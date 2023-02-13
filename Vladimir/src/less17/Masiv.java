package src.less17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Masiv {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        Integer[] someArray = {9, 10, 8, 7};
        System.out.println(Arrays.toString(someArray));
        someArray = Arrays.copyOf(someArray, someArray.length + 5);
        Collections.addAll(collection, someArray);
        System.out.println(Arrays.toString(someArray));
        System.out.println(Arrays.toString(collection.toArray()));


    }

}
