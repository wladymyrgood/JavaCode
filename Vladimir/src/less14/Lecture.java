package src.less14;

import java.util.Arrays;

public class Lecture extends Homework {


    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getLectureId() {
        return super.getLectureId();
    }

    @Override
    public void setLectureId(int lectureId) {
        super.setLectureId(lectureId);
    }

    @Override
    public String getTask() {
        return super.getTask();
    }

    @Override
    public void setTask(String task) {
        super.setTask(task);
    }

    @Override
    public Homework[] getHomework() {
        return super.getHomework();
    }

    @Override
    public void setHomework(Homework[] homework) {
        super.setHomework(homework);
    }

    @Override
    public void Go() {
        super.Go();
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", lectureId=" + lectureId +
                ", task='" + task + '\'' +
                ", homework=" + Arrays.toString(homework) +
                '}';
    }
}

