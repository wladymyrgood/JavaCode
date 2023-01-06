package src.less7;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {

        System.out.println("please enter 1 for create Сourse");
        System.out.println("please enter 2 for create Teacher");
        System.out.println("please enter 3 for create Student");
        System.out.println("please enter 4 for create Lesson");
        Scanner scanner = new Scanner(System.in);
//
        int i = scanner.nextInt();
        // if (course.courseID > 0);{}
        switch (i) {
            case 1:
                Course course = new Course(1,2);
                System.out.println(course.id);
                System.out.println(course.courseID);
                break;
            case 2:
                Teacher teacher = new Teacher(1,3);
                System.out.println(teacher.id);
                System.out.println(teacher.teachID);
                break;
            case 3:
                Student student = new Student(1,4);
                System.out.println(student.id);
                System.out.println(student.studID);
                break;
            case 4:
                Lesson lesson = new Lesson(1,5);
                System.out.println(lesson.id);
                System.out.println(lesson.lessID);
                break;
            default:
                System.out.println("Incorrect symbol");

        }
    }
}
