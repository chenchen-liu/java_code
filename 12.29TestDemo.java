import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TestDemo {
    // 实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3, 4, 5, 6} ,
    // 返回的字符串为 "[1, 2, 3, 4, 5, 6]", 注意 逗号 的位置和数量.
    public static void main(String[] args) {
        int []array = {1, 2, 3, 4, 5, 6};
        String a = toString(array) ;
        System.out.println(a);
    }
    public static String toString(int []array){
        String a = "[";
        for (int i = 0; i < array.length ; i++) {
            if (i < array.length - 1) {
                a = a + array[i] + ", ";
            }else{
                a = a+array[i]+"]";
            }
        }
        return a;
    }





    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
    public static void main4(String[] args) {
        int []array = {12,23,44,45,50,67};
        int []array2 =  CopyOf(array,array.length);
        System.out.println(Arrays.toString(array2));
    }
    public static int[] CopyOf(int []array,int num){
        if(array == null)
            return null;
        int [] ret = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }





    //    给定一个有序整型数组, 实现二分查找
    public static void main3(String[] args) {
        int []array = {12,23,44,43,50,67};
        int target = 50;
        Arrays.sort(array);
        int ret = BinarySearch(array,target);
        System.out.println(ret);
    }
    public static int BinarySearch(int [] array,int target){
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(array[mid] == target){
                return mid;
            }else if (array[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }




    //给定一个整型数组, 判定数组是否有序（递增）
    public static void main2(String[] args) {
        int []array = {12,23,44,33,45,67};
        Func(array);
    }
    public static void Func(int []array){
        boolean a = true;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                System.out.println("不是有序的");
                a = false;
            }
        }
        if(a){
            System.out.println("有序");
        }
    }






    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void main1(String[] args) {
        int[] array = {2, 34, 5, 67, 87, 66, 54, 33};
        Bubble(array);
        System.out.println(Arrays.toString(array));
    }
    public static void Bubble(int []array){
        int a = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j + 1]){
                    a++;
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
            if(a == 0)
                return;
        }
    }

}