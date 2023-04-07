package OOP;

public class TestPhone {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.brand = "小米";
        p.price = 799;

        System.out.println(p.brand + "..." + p.price);
        p.call("Jenny");
        p.sendMessage();
    }
}
