package Basic;

import java.util.Scanner;

public class demo19 {
    public static void main(String[] args) {

        int[] arr = {19, 56, 42, 36, 18};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素：");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
