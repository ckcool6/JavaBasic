package OOP;


public class Student {
    private String name;
    private int age;

    public Student(){};

    public Student(String s, String s1) {
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

    public void study() {
        System.out.println("study");
    }

    public void show() {
        System.out.println(name + "..." + age);
    }

}
