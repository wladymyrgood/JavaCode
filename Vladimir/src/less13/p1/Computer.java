package src.less13.p1;
public interface Computer {

    void getComputer();

    void getMobile(String mobile);

    default void hello() {
        System.out.println("HELLO");
    }

}
