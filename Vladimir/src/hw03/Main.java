package src.hw03;

import src.hw03.kurs1.Lesson1;
import src.hw03.kurs1.Student1;
import src.hw03.kurs1.Teacher1;
import src.hw03.kurs2.Lesson2;
import src.hw03.kurs2.Student2;
import src.hw03.kurs2.Teacher2;

public class Main {
    public static void main(String[] args) {
        Lesson1 lesson1 = new Lesson1();
        Lesson1 lesson2 = new Lesson1();
        Lesson2 lesson3 = new Lesson2();
        Student1 Student1 = new Student1();
        Student2 Student2 = new Student2();
        Teacher1 Teacher1 = new Teacher1();
        Teacher2 Teacher2 = new Teacher2();


        System.out.println(Lesson1.id + Lesson2.id);
        System.out.println(Student1.id + Student2.id);
        System.out.println(Teacher1.id + Teacher2.id);
    }
}