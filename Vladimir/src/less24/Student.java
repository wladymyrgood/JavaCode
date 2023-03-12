package src.less24;

import java.io.*;

public class Student {

    public static void main(String[] args) {
        seral("Vladimir/src/less24/StudentBackup.txt");
        deSer("Vladimir/src/less24/StudentBackup.txt");
    }

    static void seral(final String path) {
        final File file = new File(path);
        final src.less7.Student student = new src.less7.Student(1, 2);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(student);
            System.out.println("serial completed successfully " + student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deSer(final String path) {
        final File file = new File(path);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            final src.less7.Student deSer = (src.less7.Student) inputStream.readObject();
            System.out.println("deSer completed successfully " + deSer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
