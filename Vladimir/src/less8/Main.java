package src.less8;

import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int genre = 0;

        do {
            System.out.println("Select genre of Student");
            System.out.println("1. Student1");
            System.out.println("2. Student2");
            System.out.println("3. Student3");
            System.out.println("4. Student4");
            System.out.println("5. Student5");
            System.out.println("6. Student6");
            System.out.println("7. Student7");
            System.out.println("8. Exit");
            genre = scanner.nextInt();

            switch (genre) {
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
                    System.out.println("Student4");
                    break;
                case 5:
                    System.out.println("Student5");
                    break;
                case 6:
                    System.out.println("Student6");
                    break;
                case 7:
                    System.out.println("Student7");
                    break;
                case 8:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }

        } while (true);

    }
}
