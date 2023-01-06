package src.less8;

import java.util.Scanner;
//
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            String name = "Ex8" + i;
            Ex8 ex8 = new Ex8(i, "name");
            System.out.println(ex8.id + "Student");

        }

    }
}
