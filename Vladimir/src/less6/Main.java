package src.less6;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        int lesson1 = 1;
        //service.printLess1(lesson1);
        int lesson2 = 1;
       // service.printLess2(lesson2);
        int lesson3 = 1;
      //  service.printLess3(lesson3);
        int lesson4 = 1;
      //  service.printLess4(lesson4);
        int lesson5 = 1;
      //  service.printLess5(lesson5);
        int lesson6 = 1;
      //  service.printLess6(lesson6);
        //

        String sum = String.valueOf(lesson1 + lesson2 + lesson3 + lesson4 + lesson5 +lesson6);
        System.out.println(sum);
        service.printLessID6(1, 6);
    }
}