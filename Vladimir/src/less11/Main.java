package src.less11;

import static src.less11.Lecture.lectures;

public class Main {
    public static void main(String[] args) {
        Role teacher = Role.TEACHER;
        Persone persone = new Persone();
        Lecture lecture = new Lecture();
        System.out.println(lecture.getPersoneId());
        System.out.println(Role.TEACHER.getId());
        System.out.println(lectures.length);
        System.out.println(persone.getCourseId());
        System.out.println(persone.toString());

    }


}
