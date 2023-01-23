package src.less14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Homework[] homework = new Homework[5];

        Girl girl = new Girl();
        System.out.println(girl.getBoy());
        girl.Go();
        girl.getId();

        Lecture lecture = new Lecture();
        System.out.println(lecture.getId());
        System.out.println(lecture.getLectureId());
        System.out.println(lecture.getTask());
        System.out.println(Arrays.toString(lecture.getHomework()));


    }


}
