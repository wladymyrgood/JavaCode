package src.less10;

import java.util.Arrays;

public class Material extends Super {
    static Material[] materials = new Material[4];
    public Material [] getAll() {
        return materials;
    }

    public void add(final Material material, final int index) {
        materials[index] = material;
        materials = Arrays.copyOf(materials, materials.length +3);
    }

    public Material getMaterial(final int index) {
        for (int i = 0; i < materials.length; i++) {
            return materials[i];
        }
        return null;
    }

    public boolean deleteMaterial(final int index) {
        for (int i = 0; i < materials.length; i++) {
            materials[i] = null;
            return true;
        }
        return false;
    }

}
