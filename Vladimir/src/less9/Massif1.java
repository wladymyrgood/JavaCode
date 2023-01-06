package src.less9;

import java.util.Arrays;

public class Massif1 {
    public int id;
    public String name;

    public Massif1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Massif1 massif1 = new Massif1(1, "Bob");
        Massif1 massif2 = new Massif1(2, "Bob2");
        Massif1 massif3 = new Massif1(3, "Bob3");
        int[] numbers = {1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));

        numbers = Arrays.copyOf(numbers, numbers.length * 3 / 2 + 1);
        System.out.println(Arrays.toString(numbers));
    }
}




