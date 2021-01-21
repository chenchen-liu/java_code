package 两种接口;
/*
*
* 接口comparable的实现
*
* */
import java.util.Arrays;

class Student implements Comparable <Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
public class Test{
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0] = new Student("bob",12);
        stu[1] = new Student("tom",15);
        stu[2] = new Student("lily",13);
        System.out.println(Arrays.toString(stu));
        System.out.println("------------------------");
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));
    }

}