package Basic;
//静态初始化
public class demo25 {
    public static void main(String[] args) {

        int[][] arr = {{11, 22, 33}, {44, 55, 66}};
        System.out.println(arr[0][2]);

        //遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
