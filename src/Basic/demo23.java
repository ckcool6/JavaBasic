package Basic;

/* 二维数组 */
public class demo23 {
    public static void main(String[] args) {

        int[][] arr = new int[4][3];  //四个一维数组，每个一维数组有3个元素
        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);

//      System.out.println(arr[1][1]);

        arr[0][0] = 11;
        arr[1][1] = 22;
        System.out.println(arr[1][1]);


    }

}
