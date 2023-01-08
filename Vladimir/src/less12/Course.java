package src.less12;

import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        System.out.println("please enter 1");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String stringFromScanner = scanner.nextLine();

            String stringCourse = "name";

            System.out.println(stringCourse.length());
            System.out.println(stringCourse.charAt(0));

            //method getChars
            char[] chars = new char[4 - 2];
            stringCourse.getChars(2, 4, chars, 0);
            System.out.println(chars);

            //method toCharArray
            char[] chars2 = stringCourse.toCharArray();
            for (char c : chars2) {
                System.out.print(c + " ");
            }

            //method getBytes
            for (byte aByte : stringCourse.getBytes()) {
                System.out.print(aByte + " ");
            }
//        System.out.println("stringCourse - " + stringCourse);
//        String string2 = "Java";
//        String string3 = stringCourse + string2;
//        System.out.println("string3 - " + string3);
//        string3 = stringCourse.concat(string2);
//        System.out.println("string3 with concat - " + string3);
//
//        System.out.println(2 + 3 + "Hello");
//        System.out.println("Hello" + 2 + 3);
//        System.out.println("Hello" + (2 + 3));
        }
        scanner.close();

    }
}
