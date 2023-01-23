package src.less13.p1;

public class Car {

    private Engine engine;

    public static Student[] students = new Student[10];

    {
        Student student = new Student();
        students[0] = student;
    }

    {
        Student student = new Student();
        students[1] = student;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void printEngine() {
        System.out.println(this.engine);
    }

    public Engine getEngine() {
        return this.engine;
    }
}
