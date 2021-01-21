/*
*
* 测试父类和子类代码块执行顺序
* 总结：（优先执行）静态代码块 》 实例代码块 》 构造代码块
*       静态代码块优先执行且只执行一次
*       下面代码结果是：父类静态》子类静态》父类实例》父类构造》子类实例》子类构造
*
* */
class A{
    static{
        System.out.println("父类静态");
    }
    {
        System.out.println("父类实例");
    }
    public int age;
    public int score;
    public A(){
        System.out.println("父类构造无参数");
    }
    public A(int age,int score){
        System.out.println("父类构造有参数");
        this.age = age;
        this.score = score;
    }
}
public class TestDemo extends A{
    static{
        System.out.println("子类静态");
    }
    {
        System.out.println("子类实例");
    }
    public TestDemo(){
        System.out.println("子类构造无参数");
    }
    public TestDemo(int age,int score){
        System.out.println("子类构造有参数");
    }

    public static void main(String[] args) {
        TestDemo t = new TestDemo();
        System.out.println("-----------------------------------------------");
        TestDemo t2 = new TestDemo(10,90);

    }
}