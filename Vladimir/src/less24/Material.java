package src.less24;

import src.less17.ResourceType;

import java.io.*;

public class Material {
//
    public static void main(String[] args) {
        seral("Vladimir/src/less24/MaterialBackup.txt");
        deSer("Vladimir/src/less24/MaterialBackup.txt");
    }

    static void seral(final String path) {
        final File file = new File(path);
        final src.less17.Materials materials = new src.less17.Materials(1, "Weather", 2, ResourceType.URL);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(materials);
            System.out.println("serial completed successfully " + materials);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deSer(final String path) {
        final File file = new File(path);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            final src.less17.Materials deSer = (src.less17.Materials) inputStream.readObject();
            System.out.println("deSer completed successfully " + deSer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
