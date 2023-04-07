package Basic;

/* 数组及数组动态初始化，动态初始化只指定数组长度 */
public class demo15 {
    public static void main(String[] args) {

        int[] arr = new int[5];    //数组长度
        byte[] bArr = new byte[3];

        System.out.println(arr);
        System.out.println(bArr); //会打印出数组内存地址

        System.out.println(arr[2]);
        System.out.println(arr[1]); //默认初始化值

        System.out.println("-------------------------");

        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 2;
        System.out.println(arr[1]);
    }
}
