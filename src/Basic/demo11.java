package Basic;

public class demo11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 24; i++) {
            if (i == 4) {
                continue; //跳过4层
            }
            System.out.println(i + "层到了");
        }
    }
}

// break和continue的区别，break是结束循环，continue是跳过。
