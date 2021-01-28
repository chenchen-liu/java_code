package 自己实现队列;


class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class MyQueue {
    private Node first;
    private Node last;



    private boolean isEmpty(){
        if(this.first == this.last && this.first ==null){
            return true;
        }else{
            return false;
        }
    }
    public boolean offer(int val){          //尾插
        if(isEmpty()){
            Node node = new Node(val);
            this.first = node;
            this.last = node;
        }else{
            Node node = new Node(val);
            this.last.next = node;
            this.last = this.last.next;
        }
        return true;
    }

    public int poll() throws RuntimeException{      //弹出头节点
        if(isEmpty()){
            throw new RuntimeException("列表为空！");
        }else{
            int ret = this.first.val;
            this.first = this.first.next;
            return ret;
        }
    }

    public int peek() throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException();
        }else{
            return this.first.val;
        }
    }

}
