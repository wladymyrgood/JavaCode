package src.less15;

import java.util.Scanner;

public class ExepScan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teenager = 0;

        do {
            System.out.println("Select teenager of Student");
            System.out.println("1. Student1");
            System.out.println("2. Student2");
            System.out.println("3. Student3");
            System.out.println("4. Exit");
            teenager = scanner.nextInt();

            if (teenager > 4) {
                System.out.println("please input correct");
                throw new IllegalStateException();
                //continue;
            }

            switch (teenager) {
                case 1:
                    System.out.println("Student1");
                    break;
                case 2:
                    System.out.println("Student2");
                    break;
                case 3:
                    System.out.println("Student3");
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }

        } while (true);

    }
}
