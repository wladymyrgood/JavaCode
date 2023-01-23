package src.less13.p1;

public class Leptopp implements Computer, Mobile {

    @Override
    public void getComputer() {
        System.out.println("PC");
    }

    @Override
    public void getMobile(String mobile) {
        System.out.println(mobile);
    }

    @Override
    public void hello() {
        Computer.super.hello();
    }

    @Override
    public void getId() {
        System.out.println("ID");
    }

    public void getLep(Computer computer) {
        computer.hello();
    }
}
