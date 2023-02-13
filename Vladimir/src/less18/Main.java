package src.less18;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("History");
        Course course3 = new Course("Biology");

        Set<Course> courses = new TreeSet<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        System.out.println("CourseSort---------------------------------------------------------------");
        System.out.println(courses);

        List list = new ArrayList(courses);
        Comparator courseComparator = Comparator.comparing(Course::getCourseName);
        Collections.sort(list, courseComparator);
        //  System.out.println(list);

        Student student1 = new Student(1, "Volochkova", "Zhuk");
        Student student2 = new Student(3, "Anisimov", "Bondarenko");
        Student student3 = new Student(2, "Boyko", "Kravchuk");

        Set<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println("Student,TeacherSort---------------------------------------------------------------");
        System.out.println(students);
        List list1 = new ArrayList(students);

        Comparator teacherComparator = Comparator.comparing(Student::getTeacherName);
        Collections.sort(list1, teacherComparator);
        System.out.println(list1);

        Comparator getComparator = Comparator.comparing(Student::getId);
        Collections.sort(list1, getComparator);
        System.out.println(list1);


    }
}
