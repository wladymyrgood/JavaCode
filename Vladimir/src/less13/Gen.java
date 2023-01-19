package src.less13;

import java.util.Arrays;

public class Gen<E> {

    private E id;
    public E[] arrays;

    public Gen() {
    }

    public Gen(E id) {
        this.id = id;
    }

    public int getId() {
        return (int) (int) id;
    }

    public void setId() {
        this.id = id;
    }



    public E[] getArrays() {
        return this.arrays;
    }
    public void setArrays() {
        this.arrays = arrays;
    }
    public void setArrays(E[] arrays) {
        this.arrays = arrays;
    }

    public E get(final int index) {
        for (int i = 0; i < arrays.length; i++) {
            return arrays[i];
        }
        return null;
    }

    public void add(final E element) {
        this.arrays[0] = element;
    }

    public void add(final int index, final E element) {
        this.arrays[0] = element;
    }

    public E remove(final int index) {
        for (int i = 0; i < arrays.length; i++) {
            return arrays[i];
        }
        return null;
    }

    @Override
    public String toString() {
        return "Gen{" +
                "id=" + id +
                ", arrays=" + Arrays.toString(arrays) +
                '}';
    }
}