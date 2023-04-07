package Basic;

//debug
public class demo21 {
    public static void main(String[] args) {

/*      int i = 10;
        int j = 20;

        int sum = i + j;
        System.out.println(sum);*/

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                //i += sum;
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

}
