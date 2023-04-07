package Basic;

/*水仙花数，水仙花数是三位数，水仙花的个位十位百位的数字立方和等于原数*/
public class demo7 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                System.out.println("水仙花数：" + i);
            }

        }
    }
}

