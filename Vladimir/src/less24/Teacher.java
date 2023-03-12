package src.less24;

import java.io.*;

public class Teacher {

    public static void main(String[] args) {
        seral("Vladimir/src/less24/TeacherBackup.txt");
        deSer("Vladimir/src/less24/TeacherBackup.txt");
    }

    static void seral(final String path) {
        final File file = new File(path);
        final src.less7.Teacher teacher = new src.less7.Teacher(1, 2);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(teacher);
            System.out.println("serial completed successfully " + teacher);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deSer(final String path) {
        final File file = new File(path);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            final src.less7.Teacher deSer = (src.less7.Teacher) inputStream.readObject();
            System.out.println("deSer completed successfully " + deSer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
