package Basic;

public class demo22 {
    public static void main(String[] args) {

        int number = 100;
        System.out.println("before:" + number);
        change(number);
        System.out.println("after:" + number);


    }
    public static void change(int number){
        number = 200;
    }
}
