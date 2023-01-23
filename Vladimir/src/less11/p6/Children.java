package src.less11.p6;

import src.less13.p1.Student;
import src.less13.p1.Teacher;

public class Children extends Parent {
    Role role;

    Teacher teacher;

    Student student;

    public Children(Role role) {
        this.role = role;
    }

    public void createSom() {
        if (this.role == Role.TEACHER) {
            this.teacher = new Teacher();
        } else if (this.role == Role.STUDENT) {
            this.student = new Student();
        }
    }

    @Override
    public void hello() {
        getId();

        getName();

        System.out.println("Hello from Children");
    }
}
