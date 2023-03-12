package src.less7;

import java.io.Serializable;

public class Student implements Serializable {
    public int id;
    public int studID;
//
    public Student(int id, int studID) {
        this.id = id;
        this.studID = studID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studID=" + studID +
                '}';
    }
}
