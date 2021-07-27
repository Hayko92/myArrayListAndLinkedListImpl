import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(i);
            myArrayList.add(i);
        }
        for (int i : myLinkedList) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : myArrayList) {
            System.out.print(i + " ");
        }
        System.out.println();
        Iterator<Integer> it1 = myArrayList.iterator();
        Iterator<Integer> it2 = myArrayList.iterator();
        while (it1.hasNext()) {
            System.out.print(it1.next()+" ");
        }
        System.out.println();
        while (it2.hasNext()) {
            System.out.print(it2.next()+" ");
        }

    }
}
