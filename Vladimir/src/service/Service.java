package service;

import src.kurs1.Lesson1;
import src.kurs1.Student1;
import src.kurs1.Teacher1;
import src.kurs2.Lesson2;
import src.kurs2.Student2;
import src.kurs2.Teacher2;

public class Service {
    public static void main(String[] args) {
        int a1 = Lesson1.id;
        int a2 = Lesson2.id;
        int b1 = Student1.id;
        int b2 = Student2.id;
        int c1 = Teacher1.id;
        int c2 = Teacher2.id;
        System.out.println(a1 + a2);
        System.out.println(b1 + b2);
        System.out.println(c1 + c2);


    }
}
