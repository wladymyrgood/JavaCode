package src.less16;

import java.util.Arrays;

public class Dog {
    public int index;


    Dog[] dogs = new Dog[5];

    int[] dogs1 = {1, 2, 3, 4};

    //dogs1 = Arrays.copyOf(dogs1, dogs1.length + 5);
    public int findAll(Dog index) {
        this.dogs[0] = index;
        dogs1 = Arrays.copyOf(dogs1, dogs1.length + 5);
        return 1;
    }


}


