package Collection;

import java.util.ArrayList;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);

        }
    }
}
