package Basic;

/* 数组静态初始化 */
public class demo16 {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 8};
        System.out.println(arr[0]);
        System.out.println(arr[2]);

        int[] arr2 = {1,3,6}; //简写
        System.out.println(arr2[1]);
    }
}

/*
索引越界和空指针异常，数组常见的两个问题。*/
