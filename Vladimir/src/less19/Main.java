package src.less19;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Student, String> listMap = new HashMap<>();
        listMap.put(new Student(1), "Student");
        listMap.put(new Student(2), "Teacher");
        listMap.put(new Student(3), "Course");
        System.out.println(listMap);
        System.out.println(listMap.get(1));
        System.out.println(listMap.get(2));
        System.out.println(listMap.get(3));
        System.out.println(listMap.remove(1, "Student"));
        System.out.println(listMap.remove(2, "Teacher"));
        System.out.println(listMap.remove(3, "Course"));

    }

}
