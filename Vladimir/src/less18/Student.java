package src.less18;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String studentName;
    private String teacherName;

    public Student(int id, String studentName, String teacherName) {
        this.id = id;
        this.studentName = studentName;
        this.teacherName = teacherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(studentName, student.studentName) && Objects.equals(teacherName, student.teacherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, teacherName);
    }


    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);
    }
}
