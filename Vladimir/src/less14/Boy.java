package src.less14;

public interface Boy {
    void getId();

    boolean getBoy();

    default void Go() {
        System.out.println("Go");
    }

}


