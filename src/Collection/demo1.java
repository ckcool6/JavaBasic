package Collection;

import Domain.Student;

public class demo1 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 25);
        Student stu3 = new Student("王五", 22);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        for (int i = 0; i < arr.length; i++) {
            Student temp = arr[i];
            System.out.println(temp.getName() + "..." + temp.getAge());
        }

    }
}
