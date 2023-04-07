package API;

public class demo9 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); //创建一个空白的可变字符串对象，不含任何内容

        //System.out.println(sb);
        /*
        sb.append(123);
        sb.append("abc");
        sb.append(true);
        */

        sb.append("红色").append("蓝色").append("绿色");
        sb.reverse();
        String s = sb.toString();

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(s);

    }
}
