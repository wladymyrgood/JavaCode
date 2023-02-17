package src.less19;

import java.util.Objects;

public class Student {

    private int lectureId;


    public Student() {
    }

    public Student(int lectureId) {
        this.lectureId = lectureId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lectureId=" + lectureId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return lectureId == student.lectureId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lectureId);
    }
}
