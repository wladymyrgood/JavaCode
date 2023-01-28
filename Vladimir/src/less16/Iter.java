package src.less16;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Iter<E> {
    private E[] arrays;
    private int index;


    public Iter() {
    }

    public Iter(E[] arrays, int index) {
        this.arrays = arrays;
        this.index = index;
    }

    public E[] getArrays() {
        return arrays;
    }

    public void setArrays(E[] arrays) {
        this.arrays = arrays;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public boolean hasNext(int index) {
        E e = arrays[index];
        if (e != null) {
            return arrays[index + 1] != null;
        }
        return false;
    }

    public void iter() {
        for (int i = 0; i < arrays.length; i++) {
            final boolean b = hasNext(i);
            System.out.println(i + " " + b);
        }
    }

    public E remove(final int index) {
        for (int i = 0; i < arrays.length; i++) {
            return arrays[i];
        }
        return arrays[index + 1];
    }

    public E Next(final int index) {
        for (int i = 0; i < arrays.length; i++) {
            return arrays[i];
        }
        return arrays[index + 1];
    }


    public E next(int index) throws NoSuchElementException {
        try {
            return arrays[index + 1];
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        }
    }


    public int findAll(final int index, final E element) {
        this.arrays[0] = element;
        arrays = Arrays.copyOf(arrays, arrays.length + 5);
        return index;
    }
}
