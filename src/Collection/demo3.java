package Collection;

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");

        String s = list.set(0, "abc");
        System.out.println(s);
        System.out.println(list);

        String s1 = list.get(0);
        System.out.println(s1);
        int sz = list.size();
        System.out.println(sz);

    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");

        boolean b1 = list.remove("111");
        boolean b2 = list.remove("abc");

        System.out.println(b1);
        System.out.println(b2);

        String s = list.remove(0);
        System.out.println(s);
        System.out.println(list);
    }
}
