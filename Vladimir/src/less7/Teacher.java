package src.less7;

import java.io.Serializable;

public class Teacher implements Serializable {
    public int id;
    public int teachID;
//
    public Teacher(int id, int teachID) {
        this.id = id;
        this.teachID = teachID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teachID=" + teachID +
                '}';
    }
}
