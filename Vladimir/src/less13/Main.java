package src.less13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gen<Integer> gen = new Gen<>(10);
        gen.arrays = new Integer[5];
        gen.arrays[0] = 1;
        System.out.println(gen.arrays[0]);
        gen.add(1, 2);
        gen.get(2);
        System.out.println(gen.get(2));
        System.out.println(gen.remove(3));
        System.out.println(Arrays.toString(gen.arrays));
        System.out.println(gen.getId());


        Gen<String> stringGen = new Gen<>("10");
        //System.out.println(stringGen);


    }
}
