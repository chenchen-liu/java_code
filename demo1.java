package Test;

import java.util.Scanner;

public class demo {
    //递归解决斐波那契数
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

    }
}
