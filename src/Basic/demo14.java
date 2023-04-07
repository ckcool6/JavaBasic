package Basic;//猜数字
import java.util.Random;
import java.util.Scanner;

public class demo14 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNum = r.nextInt(100) + 1; //产生100以内的随机数
        while (true) {
            System.out.println("输入您猜的数据：");
            int num = sc.nextInt();

            if (num > randomNum) {
                System.out.println("大了");
            } else if (num < randomNum) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
