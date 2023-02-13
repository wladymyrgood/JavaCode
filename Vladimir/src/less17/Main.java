package src.less17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final List<Materials> materialsList = new ArrayList<>();
        Materials materials = new Materials(1, "Weather", 2, ResourceType.URL);
        Materials materials2 = new Materials(3, "Action", 4, ResourceType.VIDEO);
        Materials materials3 = new Materials(5, "Carnegie", 6, ResourceType.BOOK);
//        final boolean add = materialsList.add(materials);
//        materialsList.add(materials);
//        materialsList.add(1, materials2);
//
//        System.out.println("result add " + add);
//        materialsList.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        int genre = 0;

        do {
            System.out.println("Select genre");
            System.out.println("1." + materials.getResourceType());
            System.out.println("2." + materials2.getResourceType());
            System.out.println("3." + materials3.getResourceType());
            System.out.println("4.Exit");
            genre = scanner.nextInt();

            if (genre > 4) {
                System.out.println("please input correct");
                continue;
            }

            switch (genre) {
                case 1:
                    System.out.println(materials.getName());
                    break;
                case 2:
                    System.out.println(materials2.getName());
                    break;
                case 3:
                    System.out.println(materials3.getName());
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
