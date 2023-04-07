package Basic;

import java.util.Scanner;

public class demo20 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("请输入1-100之间的数字");
                i--;
            }
        }

      /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }*/

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        int avg = (sum - max - min) / 4;

        System.out.println(avg);
    }
}
