package Basic;

public class demo26 {
    public static void main(String[] args) {

        int sum = 0;
        int[][] arr = {{22, 66, 44,}, {77, 33, 88}, {11, 66, 99}, {25, 45, 65}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }


        }
        System.out.println(sum);
    }
}
