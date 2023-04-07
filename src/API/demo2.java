package API;

public class demo2 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";           //字符串常量池

        String s3 = new String("abc");
        String s4 = new String("abc");  //new出来的不是同一个对象

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

    }
}
