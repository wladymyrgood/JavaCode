package src.less6;

import java.io.Serializable;

public class Lesson implements Serializable {
    public int id;
    public String name;
    public Lesson(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
