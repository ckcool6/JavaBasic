package API;

public class demo8 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }

    public static void method() {
        long start = System.currentTimeMillis();//1970.1.1 0时0分0秒
        System.out.println(start);
        String s = "";
        for (int i = 0; i < 50000; i++) {
            s = s + i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
