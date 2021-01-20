
/*
 *
 * 抽象的类和接口的实现
 *
 */



abstract  class animal{
    public String name;
    public animal(String name){
        this.name = name;
    }
    public abstract void eat();
}
interface Irunning{
    void run();
}
interface Iswmming{
    void swim();
}
interface Iflying{
    void fly();
}
class dog extends animal implements Irunning{

    public dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name+" is eating");
    }

    @Override
    public void run() {
        System.out.println(this.name+" is run");
    }
}
class frog extends animal implements Iswmming{

    public frog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name+" is eating");
    }

    @Override
    public void swim() {
        System.out.println(this.name+" is swimming");
    }
}
class duck extends animal implements Iswmming,Irunning,Iflying{
    public duck(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name+" is eating");
    }


    @Override
    public void run() {
        System.out.println(this.name+" is running");
    }

    @Override
    public void swim() {
        System.out.println(this.name+" is swimming");
    }

    @Override
    public void fly() {
        System.out.println(this.name+" is flying");
    }
}
public class Test {

    public static void run(Irunning irunning){
        irunning.run();
    }
    public static void swim(Iswmming iswmming){
        iswmming.swim();
    }
    public static void fly(Iflying iflying){
        iflying.fly();
    }

    public static void main(String[] args) {
        Iflying iflying = new duck("唐老鸭");
        iflying.fly();
        Iswmming iswmming1 = new duck("唐老鸭");
        iswmming1.swim();
        Iswmming iswmming2 = new frog("小青蛙");
        iswmming2.swim();
        Irunning irunning = new dog("旺财");
        irunning.run();
        animal a1 = new dog("旺财二号");
        a1.eat();
    }
}