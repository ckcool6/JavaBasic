package Basic;

public class demo6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1-100求和：" + sum);

        // 偶数和
        int evenSum = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                evenSum = evenSum + j;
            }
        }
        System.out.println("1-100求偶数和：" + evenSum);

        //奇数和
        int oddSum = 0;
        for (int k = 1; k <= 100; k++) {
            if (k % 2 == 1) {
                oddSum = oddSum + k;
            }
        }
        System.out.println("1-100奇数和：" + oddSum);
    }
}
