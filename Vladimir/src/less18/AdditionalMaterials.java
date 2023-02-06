package src.less18;

import java.util.*;

public class AdditionalMaterials {

    public static void main(String[] args) {

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("History");
        Course course3 = new Course("Biology");

        Set<Course> courses = new TreeSet<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
//        System.out.println("CourseSort---------------------------------------------------------------");
//        System.out.println(courses);

        List list = new ArrayList(courses);
        Comparator courseComparator = Comparator.comparing(Course::getCourseName);
        Collections.sort(list, courseComparator);
//        System.out.println(list);

        Student student1 = new Student(1, "Volochkova", "Zhuk");
        Student student2 = new Student(3, "Anisimov", "Bondarenko");
        Student student3 = new Student(2, "Boyko", "Kravchuk");

        Set<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
//        System.out.println("Student,TeacherSort---------------------------------------------------------------");
//        System.out.println(students);
        List list1 = new ArrayList(students);

//        Comparator teacherComparator = Comparator.comparing(Student::getTeacherName);
//        Collections.sort(list1, teacherComparator);
//        System.out.println(list1);

        Comparator getComparator = Comparator.comparing(Student::getId);
        Collections.sort(list1, getComparator);
//        System.out.println(list1);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("please enter 1 to retrieve data by ID");
            System.out.println("please enter 2 to receive data by lecture number");
            System.out.println("please enter 3 for data by type");
            System.out.println("please enter 4 EXIT");
            ;
            choice = scanner.nextInt();

            if (choice > 4) {
                System.out.println("please input correct");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println(list1);
                    break;
                case 2:
                    System.out.println(students);
                    break;
                case 3:
                    System.out.println(courses);
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
