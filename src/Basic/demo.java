package Basic;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");

        int num = sc.nextInt();
        int ge = num % 10;
        int shi = (num / 10) % 10;
        int bai = num /100;

        System.out.println("整数" + num + "个位为：" + ge);
        System.out.println("整数" + num + "十位为：" + shi);
        System.out.println("整数" + num + "百位为：" + bai);

    }
}
