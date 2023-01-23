package src.less15;

public class Main {
    public static void main(String[] args) {
        Black blacks = new Black(1);

        try {
            blacks.black(1);
        } catch (EntityNotFoundException e) {
            System.out.println("Black not found :" + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}