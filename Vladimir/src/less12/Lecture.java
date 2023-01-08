package src.less12;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        System.out.println("please enter 1");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String stringFromScanner = scanner.nextLine();
            String stringLecture = "name, dicription";

            //method regionMatches
            System.out.println("name, dicription!!!".regionMatches(6, "name", 0, 3));
            //method endsWith
            System.out.print("dicription endsWith 'on' - ");
            System.out.println(stringLecture.endsWith("re"));
            //method split
            String st = "name, dicription";
            String[] array = st.split(", ");
            for (String s : array) {
                System.out.println(s);
            }
        }
        scanner.close();
    }
}