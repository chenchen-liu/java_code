public class TestDemo {
    public static void func(int[]array){
        int i = 0;
        int j = array.length-1;

        for (; i < j; i++) {
            if (array[i] % 2 == 1) {
                for (; j > i; j--) {
                    if (array[j] % 2 == 0) {
                        Swap(array, i, j);
                        break;
                    }
                }

            }
        }
    }
    public static void Swap(int []array,int a,int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    public static void print(int []array){
        for (int x:array
        ) {
            System.out.print(x+" ");
        }
    }
    public static void swapArray(int []a,int []b){
        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }

    }
    public static void main(String[] args) {
        int[] src = {1,2,3,4,5,6,7,8,9,10};
        int[] dst = {10,9,8,7,6,5,4,3,2,1};
        swapArray(src,dst);
        print(src);
        System.out.println("");
        print(dst);
    }
    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
    public static void main1(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,12,22,23,51};
        func(array);
        print(array);
        }
}

