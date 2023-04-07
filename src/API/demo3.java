package API;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {

        String username = "admin";
        String password = "5520";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            System.out.println("请输入用户名：");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码：");
            String scPassword = sc.nextLine();

            if (username.equals(scUsername) && password.equals(scPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败，还剩余" + (6 - i) + "次机会");
            }

        }
    }
}
