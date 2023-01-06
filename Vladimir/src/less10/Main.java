package src.less10;

import java.util.Arrays;

import static src.less10.Material.materials;

public class Main {
    public static void main(String[] args) {
        Material material = new Material();

        System.out.println(material.deleteMaterial(1));
        System.out.println(material.getMaterial(1));
        System.out.println(materials.length);
        System.out.println(Arrays.toString(material.getAll()));

    }
}
