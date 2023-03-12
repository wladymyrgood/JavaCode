package src.less24;

import src.less6.Lesson;

import java.io.*;

public class Lecture {

    public static void main(String[] args) {
        seral("Vladimir/src/less24/LectureBackup.txt");
        deSer("Vladimir/src/less24/LectureBackup.txt");
    }

    static void seral(final String path) {
        final File file = new File(path);
        final src.less6.Lesson lesson1 = new Lesson(1, "Kurs1");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(lesson1);
            System.out.println("serial completed successfully " + lesson1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deSer(final String path) {
        final File file = new File(path);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            final Lesson deSer = (Lesson) inputStream.readObject();
            System.out.println("deSer completed successfully " + deSer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
