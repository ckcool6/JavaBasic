package OOP;

public class TestStudentDemo {
    public static void main(String[] args) {

        StudentDemo stu = new StudentDemo("Bob",11);
        StudentDemo stu1 = new StudentDemo("Jenny",12);
        StudentDemo stu2 = new StudentDemo("Lyra",22);

        stu.show();
        stu1.show();
        stu2.show();
    }
}
