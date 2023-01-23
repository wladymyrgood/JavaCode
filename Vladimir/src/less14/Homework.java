package src.less14;

public abstract class Homework {

    public int id;
    public int lectureId;

    public String task;

    Homework[] homework = new Homework[5];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Homework[] getHomework() {
        return homework;
    }

    public void setHomework(Homework[] homework) {
        this.homework = homework;
    }

    public void Go() {
        System.out.println("Go");
    }


}
