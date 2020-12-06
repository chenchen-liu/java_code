package Test;

import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Demo {

    public static void main3(String[] args) {
        Random random = new Random();               //生成随机数种子
        int goal = random.nextInt(100);
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a > goal){
                System.out.println("大了");
            }else if(a < goal){
                System.out.println("小了");
            }else{
                System.out.println("==");
                break;
            }
        }

    }
    //登录账号
    public static void main(String[] args) {
        String a = "Tom";
        String b = "12345";
        System.out.println("你有三次输入机会");
        int num = 3;
        while(num > 0) {
            System.out.println("请输入账户和密码");
            Scanner scanner = new Scanner(System.in);
            String c = scanner.nextLine();
            String d = scanner.nextLine();
            if ((a == c) && (b == d)) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
            num--;
        }
    }

                                    // 新手学习输入输出以及int和String的转换
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double a = scanner.nextDouble();
        System.out.println(a);
        System.out.println(str);
        int sum = 0;
        while(scanner.hasNextInt()){
            int  b = scanner.nextInt();
            sum += b;
        }
        System.out.println(sum);

        /*Scanner scanner = new Scanner(System.in);                 //输入数字求和
        int b = 0;
        int sum = 0;                    //和
        int num = 0;                    //输入次数
        while(scanner.hasNextInt()){
             b = scanner.nextInt();
            sum += b;
            num ++;
        }
        System.out.println("结果是"+sum);
        System.out.println("次数是"+num);*/

        /*String str = "199";
        int a = Integer.valueOf(str);
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        String ret = scanner.nextLine();
        int b = Integer.valueOf(ret);
        System.out.println(b+1);
        */
    }
}
