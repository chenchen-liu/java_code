package Test;

import java.util.Scanner;

public class demo1 {
    //递归求 N 的阶乘
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = Fac(n);
        System.out.println(ret);
    }
    public static int Fac(int num){
        if(num < 1){
            return 1;
        }
        return Fac(num - 1)*num;
    }


  //  递归求 1 + 2 + 3 + ... + 10
/*  public static void main(String[] args) {
      int a = 10;
      int sum = Sum(a);
      System.out.println(sum);
  }
  public static int Sum(int num){
      if(num == 1){
          return 1;
      }
      return Sum(num - 1) + num;
  }*/




    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Print(a);
    }
    public static void Print(int num){
       if(num > 9){
           Print(num / 10);
       }
        System.out.print((num % 10) + " ");
    }*/




   /* //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = SpeSum(a);
        System.out.println(sum);
    }
    public static int SpeSum(int num){
        if(num < 10){
            return num;
        }
        return SpeSum(num / 10)+ num % 10;
    }*/



    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    /*public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum1 = Sum(a,b);
        System.out.println(sum1);
        double c = 10.0;
        double d = 20.0;
        double e = 30.0;
        double sum2 = Sum(c,d,e);
        System.out.println(sum2);
    }
    public static int Sum(int i,int j ){
        return i + j;
    }
    public static double Sum(double i,double j ,double k){
        return i + j + k;
    }*/

   /*// 求 N 的阶乘 。(递归)
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = Fac(n);
       System.out.println(sum);
   }
   public static int Fac(int num){
       if(num == 1){
           return 1;
       }
       return num * Fac(num-1);
   }*/

    
   /* //求1！+2！+3！+4！+........+n!的和,n为用户输入的数字
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {              //此处循环用来产生要求的阶乘的数字
            sum += Fac(i);
        }
        System.out.println(sum);
    }
    public static int Fac(int num){         //Fac用来求一个数字的阶乘
        if(num == 1){
            return 1;
        }
        return num*Fac(num-1);
    }*/


    /*//递归解决斐波那契数
    public static int Fac(int num){
        if(num <= 2){
            return 1;
        }
        return Fac(num - 1)+Fac(num - 2);
    }
    public static void main(String[] args) {
        int b = 6;
        int sum = Fac(b);
        System.out.println(sum);
    }
    //迭代法求斐波那契数
    public static void main1(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int j = 1;
        int k = 1;
        for (int i = 3; i <= a; i++) {
            int tmp = j;
            j = k;
            k = tmp + k;
        }
        System.out.println(k);

    }*/
}
