import java.lang.reflect.Array;
import java.util.*;

public class MyArrayList<T> {
    // initial capacity==15
    // and my custom Arraylist is growing by 10 when it is full;
    private static final int INITIAL_CAP = 15;
    private static final double LOAD_FACTOR = 0.75;
    private int pointer = 0;
    private Object[] objects;

    public MyArrayList() {
        this.objects = new Object[INITIAL_CAP];
    }

    public void add(T t) {
        objects[pointer] = t;
        pointer++;
        if ((double)pointer/objects.length>LOAD_FACTOR) {
            growSize();
        }
    }

    public int size() {
        return pointer;
    }

    private void growSize() {
        Object[] newObj = new Object[objects.length + 10];
        newObj = Arrays.copyOf(objects, newObj.length);
        objects = newObj;
    }

    public T get(int index) {
        T res = null;
        if (index >= 0 && index < objects.length) res = (T) objects[index];
        return res;
    }

    public void remove(int index) {
        if (pointer == 0) return;
        Object[] newObj = new Object[objects.length];
        for (int i = 0, k = 0; i < objects.length; i++) {
            if (i != index) {
                newObj[k] = objects[i];
                k++;
            }
        }
        pointer--;
        objects = newObj;
    }

    public boolean contains(T t) {
        for (Object o : objects) {
            if (t.equals(o)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < pointer; i++) {
            res.append(objects[i]);
            if (i != pointer - 1) res.append(",");
        }
        return res.toString();
    }
}
