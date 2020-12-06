/*
*date：2020.12.4
*循环作业
*
* 输入和输出练习
*/


import java.util.Scanner;

public class TestDemo {
    //输入数字，则会按照最大位到最小位依次输出
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = a;
        int num = 0;
        while(m > 0){
            num++;
            m /= 10;
        }
        while(num > 0){
            int b = 1;
            for(int j = num;j > 1;j--){
                b *=10;
            }
            int n = a / b;
            System.out.print(n+",");
            a -= (n*b);
            num--;
        }
    }
   // 输出n*n的乘法口诀表，n由用户输入。
    public static void main12(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int a = scanner.nextInt();
          for(int i = 1;i <= a;i++){
              for(int j = 1;j <= i;j++){
                  System.out.printf("%d * %d = %d  ",j,i,j*i);
              }
              System.out.printf("\n");
          }
    }
       //获取一  个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
       public static void main11(String[] args) {

          Scanner scanner = new Scanner(System.in);
          int a = scanner.nextInt();
          int m = a;
           System.out.println("从右向左奇数位：");
          for(int i = 0;i < 32;i += 2){
              if((m & (1 << i)) > 0){
                  System.out.print(1+" ");
              }else{
                  System.out.print(0+" ");
              }
          }
           System.out.println(" ");
           System.out.println("从右向左偶数位:");
           int n = a;
           for(int i = 1;i < 32;i += 2){
               if((n & (1 << i)) > 0){
                   System.out.print(1+" ");
               }else{
                   System.out.print(0+" ");
               }
           }
       }

   // 求一个整数，在内存当中存储时，二进制1的个数。
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int num = 0;
        while(a > 0){
            if((a & 1) == 1){
                num++;
            }
            a >>>= 1;
        }
        System.out.println(num);
    }
    //求两个正整数的最大公约数
    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        int max = a > b ? a:b;
        int min = a < b ? a:b;
        while(true){
            if((max % min) == 0){
                System.out.println(min);
                break;
            }
            int tmp = min;
            min = max % min;
            max = tmp;
        }
    }



    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main8(String[] args) {
        double a = 1.0;
        int x = 1;
        double result = 0.0;
        double sum1 = 0.0;
        while(x <= 99){
            sum1 += (a / x);
            x += 2;
        }
        int y = 2;
        double sum2 = 0.0;
        while(y <= 100){
            sum2 +=(a / y);
            y += 2;
        }
        result = sum1 - sum2;
        System.out.println(result);
    }


    //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
    //其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
    public static void main7(String[] args) {
        for (int i = 1; i <= 999; i++) {

            int j = i;
            int k = i;
            int sum = 0;//用来表示此i的立方和
            int sum1 = 1;
            int num = 0;//用来表示i的位数
            while (j > 0) {
                j /= 10;
                num++;
            }       //num已知
            while (k > 0) {
                int m = k % 10;
                int a = num;
                for (; a > 0; a--) {
                    sum1 *= m;
                }
                sum += sum1;
                sum1 = 1;
                k /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    //是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age <= 18){
            System.out.println("少年");
        } else if(age > 18 && age <= 28){
            System.out.println("青年");
        } else if(age > 28 && age <= 55){
            System.out.println("中年");
        }else if(age > 56){
            System.out.println("老年");
        }else{
            System.out.println("输入错误");
        }
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);       //输入方式记住了啊！
        int b = scanner.nextInt();
        for(int i = 2; i <= b;i++){
            if(i == b){
                System.out.println(b+"是素数。");
                break;
            }
            if(b % i == 0){
                System.out.println(b+"不是素数！");
                break;
            }

        }
    }
    public static void main4(String[] args) {     //此处注意，当编译时，只有编译过程遇到字符串，在字符串后面的+都是表示拼接
        int a = 10;
        int b = 20;
        int c =30;
        System.out.println(a+b+"hello"+a+b);      //结果是30+hello+10+20
    }
    public static void main3(String[] args) {   //打印1-100的素数
       for(int a = 1; a < 100;a++){
           for(int i = 2;i <= a;i++){
               if(i == a){                          //注意两个if语句的位置，如果交换两if语句的位置，结果将会不一样
                   System.out.println(a);
               }
               if(a % i == 0){
                   break;
               }
           }
       }

    }
    public static void main2(String[] args) {         //计算1000~2000内的闰年
        int a = 1000;
        while(a <= 2000){
            if((a % 4 == 0)&&(a % 100 != 0) || (a % 400 == 0)){     //多次使用逻辑运算符
                System.out.println(a);
            }
            a++;
        }
    }
    public static void main1(String[] args) {       //计算100内9出现的个数
        int a = 1;
        int num = 0;
        while(a <= 100){
            if((a % 10 == 9) || (a / 10) == 9 ){     //用到逻辑或，注意逻辑或也叫短路或，
                num++;                               //若前一个boolean表达式值为假，则后面的表达式不执行
            }
            a++;
        }
        System.out.println(num);
    }

}
