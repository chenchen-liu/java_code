package List;
/*
* 1.List集合内有学生，学生的属性有名字和年龄，打印每个学生的属性；
*2.使用Collection sort对一个整形数据的集合进行排序
*
* */
import java.util.*;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test{
    public static void main(String[] args) {

        //1.
        ArrayList<Student> List = new ArrayList<>();
        List.add(new Student("张三",21));
        List.add(new Student("李四",20));
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        for (Student s:List) {
            System.out.println(s);
        }

        //迭代器进行打印
        Iterator<Student> iterator = List.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //2.
        ArrayList<Integer>list = new ArrayList<>();
        list.add(89);
        list.add(67);
        list.add(23);
        Collections.sort(list);
        System.out.println(list);
    }
}