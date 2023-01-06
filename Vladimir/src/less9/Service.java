package src.less9;

import java.util.Scanner;

public class Service {
    public int id;
    public String name;

    public Service(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Massif1 massif1 = new Massif1(1, "Bob");
        Massif1 massif2 = new Massif1(2, "Bob2");
        Massif1 massif3 = new Massif1(3, "Bob3");
        Scanner scanner = new Scanner(System.in);
        int genre = 0;

        do {
            System.out.println("Select genre of Student");
            System.out.println("1. Massif1");
            System.out.println("2. Massif2");
            System.out.println("3. Massif3");
            System.out.println("4. Exit");
            genre = scanner.nextInt();

            if (genre > 4) {
                System.out.println("please input correct");
                continue;
            }

            switch (genre) {
                case 1:
                    System.out.println(massif1.id);
                    break;
                case 2:
                    System.out.println(massif2.id);
                    break;
                case 3:
                    System.out.println(massif3.id);
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

