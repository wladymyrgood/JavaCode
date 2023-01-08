package src.less11;

public class Persone {
    private int courseId;
    private static int counter = 0;
    private String name;
    private Role rols;

    public Persone() {
    }

    public Persone(int courseId, String name, Role rols) {
        this.courseId = courseId;
        this.name = name;
        this.rols = rols;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int coureId) {
        this.courseId = coureId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Persone.counter = counter;
    }

    public static void addCounter(int counter) {
        Persone.counter += counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRols() {
        return rols;
    }

    public void setRols(Role rols) {
        this.rols = rols;
    }

    public Persone(String name) {
        this.name = name;
        counter ++;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", counter='" + counter + '\'' +
                ", rols=" + rols +
                '}';
    }
}
