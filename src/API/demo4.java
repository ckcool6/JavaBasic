package API;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();  //

        /*for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }*/
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
