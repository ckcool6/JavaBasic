package Basic;/*public class 基础.demo10 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}*/

//不确定循环次数用while循环
public class demo10 {
    public static void main(String[] args) {
        int count = 0;

        double paper = 0.1;
        int mountain = 8844430;

        while (paper <= mountain) {
            paper = paper * 2;
            count++;
        }
        System.out.println(count);
    }
}
