import java.util.Arrays;

public class MyArraylist {

    private int[] elem;
    private int usedsize;       //表示顺序表内有效数据的个数

    //两种构造方法
    MyArraylist() {
        elem = new int[5];
    }

    MyArraylist(int num) {
        this();
        this.usedsize = num;
    }

    //判断顺序表内有效数据是否已满
    public boolean isFull() {
        if (this.usedsize == this.elem.length) {
            return true;
        } else {
            return false;
        }
    }

    //判断顺序表内是否有有效数据
    public boolean hasnoData() {
        if (this.usedsize == 0) {
            System.out.println("There is no data!");
            return true;
        } else {
            return false;
        }
    }

    //打印顺序表
    public void display() {
        if (hasnoData()) {
            return;
        }
        for (int i = 0; i < this.usedsize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        if (isFull()) {
            System.out.println("顺序表已满，我会自动扩容哦");
            resize();
        }
        if (pos < 0 || pos > this.usedsize) {
            System.out.println("pos位置不合法");
            return;
        }
        for (int i = this.usedsize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedsize++;
    }

    //默认末尾添加元素
    public void add2(int data){
        if(isFull()){
            resize();
        }
        this.elem[usedsize] = data;
        this.usedsize++;
    }

    //扩容数组
    public void resize(){
        this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
    }




    //判定是否包含某个元素
    public boolean contains(int toFind) {
        if (hasnoData()) {
            return false;
        }
        for (int i = 0; i < this.usedsize ; i++) {
            if (elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }


    //查找某个元素的位置
    public int serach(int toFind) {
        int num = 0;
        if(hasnoData()){
            return -1;
        }
        while(this.elem[num] != toFind && num < this.usedsize){
            num++;
        }
        if(num < this.usedsize){
            return num;
        }else{
            return -1;
        }
    }


    //获取pos位置的元素
    public int getpos(int pos){
        if(pos < 0 || pos > this.usedsize - 1){
            return -1;
        }
        return this.elem[pos];
    }

    //给pos位置元素设为value
    public void setPos(int pos, int value){
        if(pos < 0 || pos > this.usedsize-1){
            System.out.println("pos位置不合法！");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove){
        if(hasnoData()){
            return;
        }
        for (int i = 0; i < this.usedsize; i++) {
            if(this.elem[i] == toRemove){
                for (int j = i; j < this.usedsize-1; j++) {        //此处注意，如果第一次出现的关键字key位置是this.usedsize
                    this.elem[j] = this.elem[j+1];                 //也没有关系，进不去for循环，直接将有效数据个数减一即可；
                }
                this.usedsize--;
                return;
            }
        }
    }


    //获取顺序表长度
    public int size(){
        return this.elem.length;
    }


    //清空顺序表
    public void clear(){
        this.usedsize = 0;
        return;
    }
}