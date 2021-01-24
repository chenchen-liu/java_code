package 测试;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Test {
    String name;

    //字符串查找
    public static void main(String[] args) {
        String str1 = "abcdfgh";
        System.out.println(str1.contains("c"));
        //indexOf查找方法返回值为int，下标为0开始
        System.out.println(str1.indexOf("gh"));     //查找并且返回字符串的位置，如果没有则返回-1；
        System.out.println(str1.indexOf("g", 2));//从指定位置fromIndex位置查找；
        System.out.println(str1.lastIndexOf("a"));//从后往前查找
        System.out.println(str1.lastIndexOf("a", 7));//从指定位置从后往前查找；

    }


    public static void main2(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));


    }
    public static void main1(String[] args) {
        String str = new String("hello");
        char[] array = {'h','e'};
        System.out.println(Arrays.toString(array));



        String dst  = "你好";
        String src = new String("你好").intern();
        src = "h" + src.substring(1);


        //字符数组转变成字符串
        char[] a = {'l','c','c','l','o','v','e','m','t','t'};
        String s1 = new String(a);
        String s2 = new String(a,2,2);              //offset代表字符数组下标开始，count代表要转变的个数；
        String s3 = String.copyValueOf(a,2,2);
        String s4 = String.valueOf(a,2,2);
        String s5 = String.copyValueOf(a);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        s5.length();


        //字符串转变成字符数组
        String str1 = "lcclovemtt";
        char c1 = str1.charAt(0);           //括号内代表要转变的字符数组下标，从0开始；
        char c2= str1.charAt(4);
        char[] c3 = str1.toCharArray();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //判断字符串是不是全部为数组构成
        String string = "1234";
        System.out.println(isNumber(string));


        //字节与字符串
        byte[] b = {'0','1','2'};
        String string1 = new String(b);
        String string2 = new String(b,2,1);
        System.out.println(string1);
        System.out.println(string2);

        String string3 = "1234p高";
        byte[] b1 = string3.getBytes();
        System.out.println(Arrays.toString(b1));

        byte[] b2 = {1,23,-111,123};
        System.out.println(new String(b2));
    }




    public static boolean isNumber(String str){
        char[] c = str.toCharArray();
        for (char value : c) {
            if (value < '0' || value > '9') {
                return false;
            }
        }
        return true;

    }

}
