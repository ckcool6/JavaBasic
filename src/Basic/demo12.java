package Basic;

import java.util.Scanner;

public class demo12 {
    public static void main(String[] args) {
        lo:while (true) {                                      //lo循环标号
            System.out.println("请输入需要查看的星期数：");
            System.out.println("按0退出");

            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();

            switch (week) {
                case 0:
                    break lo;
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("骑自行车");
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }
}
