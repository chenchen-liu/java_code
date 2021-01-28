package 循环队列的实现;

class MyCircularQueue {
    private int front;
    private int rear;
    private int[]elem;
    public MyCircularQueue(int k) {
        this.elem = new int[k];
        this.front = 0;
        this.rear = 0;
    }


    //放入元素
    public boolean enQueue(int value) throws RuntimeException{
        if(isFull()){
            throw new RuntimeException("元素满了！");
        }else{
            this.elem[rear] = value;
            this.rear = (this.rear+1)%this.elem.length;
            return true;
        }
    }

    //删除元素
    public boolean deQueue() throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("元素为空了！");
        }else{
            /*this.rear = (this.rear+this.elem.length-1)%this.elem.length;*/
            this.front = (this.front+1)%this.elem.length;
            return true;
        }
    }

    //返回头元素值
    public int Front() throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("元素为空！");
        }else{
            return this.elem[front];
        }
    }

    //返回尾元素的值
    public int Rear() {
        if(isEmpty()){
            throw new RuntimeException("元素为空！");
        }else{
            return this.elem[(rear+this.elem.length-1)%this.elem.length];
        }
    }

    public boolean isEmpty() {
        if(this.front == this.rear){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull() {
        int a = (this.rear + 1 ) % this.elem.length;
        if(a == this.front){
            return true;
        }else{
            return false;
        }
    }
}
public class Test{
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        myCircularQueue.enQueue(12);
        myCircularQueue.enQueue(22);
        myCircularQueue.enQueue(32);


        myCircularQueue.deQueue();
        myCircularQueue.deQueue();
        myCircularQueue.deQueue();
        myCircularQueue.enQueue(44);
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.Rear());


    }
}