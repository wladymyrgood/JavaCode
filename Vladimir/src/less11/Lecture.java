package src.less11;

import java.util.Arrays;

public class Lecture {
    private int personeId;

    public Lecture() {
    }

    public Lecture(int personeId) {
        this.personeId = personeId;
    }

    public int getPersoneId() {
        return personeId;
    }

    static Lecture[] lectures = new Lecture[3];

    public void add(final Lecture lecture, final int index) {
        lectures[index] = lecture;
        lectures = Arrays.copyOf(lectures, lectures.length +1);

    }
}
