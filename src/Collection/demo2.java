package Collection;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add(1,"666");

        System.out.println(list);
    }
}
