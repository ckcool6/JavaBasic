package Basic;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = sc.nextInt();

        if(score >= 0 && score <= 100){
            if(score >= 95 && score <= 100){
                System.out.println("一等奖");
            } else if (score >= 90 && score <= 94) {
                System.out.println("二等奖");
            } else if (score >= 80 && score <= 89) {
                System.out.println("三等奖");

            } else {
                System.out.println("没有奖励");
            }

        }else {
            System.out.println("输入错误");
        }
    }
}
