package API;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        String result = s.replace("TMD", "***");
        System.out.println(result);

    }
}
