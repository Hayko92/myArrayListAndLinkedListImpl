public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> ob = new MyArrayList<>();
        for (int i = 0; i < 20; i++) {
            ob.add(i + 2);
        }
        System.out.println(ob);
        System.out.println(ob.size());
        System.out.println(ob.get(2));
        ob.remove(0);
        ob.remove(0);
        System.out.println(ob);
        System.out.println(ob.size());
        System.out.println(ob.contains(18));
        System.out.println(ob.contains(22));
    }
}
