package OOP;

//JavaBean 封装数据类
public class StudentDemo {
    private int age;
    private String name;

    public StudentDemo() {

    }

    public StudentDemo(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


    public void show() {
        System.out.println(name + "  " + age);
    }
}
