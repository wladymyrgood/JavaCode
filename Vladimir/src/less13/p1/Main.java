package src.less13.p1;

public class Main {


    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car(engine);
        System.out.println(Car.students[0]);

        Leptopp leptopp = new Leptopp();

        Mobile computer = new Mobile() {
            @Override
            public void getId() {

            }

            @Override
            public void getComputer() {
                System.out.println("");
            }

            @Override
            public void getMobile(String mobile) {
                System.out.println("");
            }

            @Override
            public void hello() {
                System.out.println("Pruvit");
            }
        };

       // leptopp.getLep((Computer) computer);

      /*  Person person = new Teacher();

        Computer computer = new Leptopp();

        computer.hello();

        Mobile mobile = new Leptopp();

        mobile.getId();

        Leptopp leptopp = new Leptopp();

        Computer computer1 = new Computer() {
            @Override
            public void getComputer() {
                System.out.println("My PC Ananim");
            }

            @Override
            public void getMobile(String mobile) {
                System.out.println(mobile);
            }
        };

        computer1.getComputer();
        computer1.getMobile("Mobile");*/


    }
}
