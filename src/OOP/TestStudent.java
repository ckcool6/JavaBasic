package OOP;

public class TestStudent {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.setName("Bob");
        stu.setAge(12);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        stu.show();

        System.out.println(stu);
    }
}
