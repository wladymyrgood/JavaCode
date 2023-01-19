package src.less7;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        System.out.println("please input 1");
        Scanner scanner = new Scanner(System.in);

       while (scanner.hasNext()) {
            final String stringFromScanner = scanner.nextLine();
            Course course = new Course(1,5);
            System.out.println(course.courseID);
        }
//


    }
}