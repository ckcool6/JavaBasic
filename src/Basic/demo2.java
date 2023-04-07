package Basic;

// 扩展赋值运算符自带强转
public class demo2 {
    public static void main(String[] args) {
        int a = 10;
        a += 20;
        System.out.println(a);

        short ss = 1;
        ss += 1;  // ss = (short) (ss+1);
        System.out.println(ss);
    }
}

