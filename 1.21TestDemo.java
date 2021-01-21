package 常见的两种接口;
/*
*comparator接口的实现
 *构造器的实现
 *
 */

import java.util.Arrays;
import java.util.Comparator;


//通过每个对象的年龄进行比较排序
class AgeComparator implements Comparator <Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

//通过每个对象的名字进行比较排序
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}


class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override               //重写toString方法
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



public class TestDemo {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0] = new Student("tom",12);
        stu[1] = new Student("bo",22);
        stu[2] = new Student("Bo",23);
        System.out.println(Arrays.toString(stu));
        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(stu,ageComparator);
        System.out.println(Arrays.toString(stu));
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(stu,nameComparator);
        System.out.println(Arrays.toString(stu));

    }
}
