package src.less13.p1;

public class Teacher extends Person {

    @Override
    public String getName() {
        return "Teacher " + name;
    }

    @Override
    public String getSecondName() {
        return "Teacher" + secondName;
    }
}
