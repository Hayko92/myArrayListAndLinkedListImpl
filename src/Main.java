public class Main {
    public static void main(String[] args) {
//        MyArrayList<Integer> ob = new MyArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            ob.add(i + 2);
//        }
//        System.out.println(ob);
//        System.out.println(ob.size());
//        System.out.println(ob.get(2));
//        ob.remove(0);
//        ob.remove(0);
//        System.out.println(ob);
//        System.out.println(ob.size());
//        System.out.println(ob.contains(18));
//        System.out.println(ob.contains(22));
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 5; i++) {
            myLinkedList.add(i);
        }
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.contains(1));
        System.out.println(myLinkedList.contains(5));
        myLinkedList.add(1,20);
        System.out.println(myLinkedList);
        myLinkedList.add(2,30);
        System.out.println(myLinkedList);
        myLinkedList.add(1,15);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));



    }
}
