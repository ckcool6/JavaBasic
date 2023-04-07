package Basic;

public class demo24 {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        //arr[2][3] = 100; //数组越界

        int[] arr1 = {11, 22, 33};
        int[] arr2 = {44, 55, 66};
        int[] arr3 = {77, 88, 99,100};

        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;

        System.out.println(arr[1][2]);
        System.out.println(arr[2][3]);
    }
}
