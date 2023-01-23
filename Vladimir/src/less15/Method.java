package src.less15;

public class Method {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10 / a;

            int array[] = {3, 4, 1};
            System.out.println(array[3]);


        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException :" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ex " + e);

            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.toString());
            }
        }

        System.out.println("Program is still running");

    }
}
