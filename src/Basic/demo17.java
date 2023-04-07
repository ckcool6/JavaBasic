package Basic;

public class demo17 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};

        for (int i = 0; i < arr.length; i++) {                // 遍历
            System.out.println(arr[i]);
        }

        int max = arr[0]; //假设第0个数字是最大值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值" + max);                  //寻找最大值
    }
}
