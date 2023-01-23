package src.less14;

public class Girl implements Boy {


    @Override
    public void getId() {
        System.out.println("ID");

    }

    @Override
    public boolean getBoy() {
        System.out.println("Vova");
        return false;
    }

    @Override
    public void Go() {
        Boy.super.Go();
    }
}
