package Basic;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        int week = sc.nextInt();
        switch (week){
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
