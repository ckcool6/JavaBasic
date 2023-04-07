package Basic;

// 三元运算符
public class demo3 {
    public static void main(String[] args) {
        int a = 150;
        int b = 165;
        int c = 178;

        int tempHeight = (a > b) ? a : b;
        int maxHeight = (tempHeight > c) ? tempHeight : c;

        System.out.println(maxHeight);

    }
}
