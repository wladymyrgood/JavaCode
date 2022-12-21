package src.less6;
public class Service {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson(1, "Kurs1");
        Lesson lesson2 = new Lesson(2, "Kurs2");
        Lesson lesson3 = new Lesson(3, "Kurs3");
        Lesson lesson4 = new Lesson(4, "Kurs4");
        Lesson lesson5 = new Lesson(5, "Kurs5");
        Lesson lesson6 = new Lesson(6, "Kurs6");
    }
    void printLess1(int lesson1) {
        System.out.println(lesson1);

    }
    void printLess2(int lesson2) {
        System.out.println(lesson2);

    }
    void printLess3(int lesson3) {
        System.out.println(lesson3);

    }
    void printLess4(int lesson4) {
        System.out.println(lesson4);

    }
    void printLess5(int lesson5) {
        System.out.println(lesson5);

    }
    void printLess6(int lesson6 ) {
        System.out.println(lesson6);
    }
    void printLessID6(int ... ints ) {
        int lessid = ints[1];
        System.out.println(lessid);
    }
}
