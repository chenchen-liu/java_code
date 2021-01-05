



/*
*单链表的简单设计
*
* 1月4号
*/




class Node{
    public int val;
    public Node next;
    public Node(){
    }
    public Node(int x){
        this.val = x;
    }
}

public class MyLinkedlist {
    public Node head;


    //打印
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
     }

     //无脑创建
    public Node creat(){
        this.head = new Node(40);
        Node n2 = new Node(30);
        Node n3 = new Node(20);
        Node n4 = new Node(10);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        return head;

    }

    //找到链表的最后一个节点
    public Node findLast(){
        Node cur = this.head;
        if(this.head == null){
            return null;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
            return cur;
        }
  }


    //找到链表的倒数第二个节点
    public Node findLastwo(){
        if(this.head == null || this.head.next == null ){
            return null;
        }else{
            Node prev = this.head;
            Node n = this.head;
            n = n.next;
            while (n.next != null){
                prev = n;
                n = n.next;
             }
            return prev;
        }
     }


    //找到链表的第个节点
    public Node findFirst(){
        return this.head;
    }

    //计算链表中元素个数
    public int num(){
        Node cur = this.head;
        if(cur == null){
            return -1;
        }else {
            int num = 0;
            while (cur != null) {
                num++;
                cur = cur.next;
            }
            return num;
        }
    }


    //找到链表中是否包含某个元素
    public boolean findkey(int key){
        if(this.head == null){
            return false;
        }else{
            Node cur = this.head;
            while(cur != null){
                if(cur.val == key){
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }

    }

}
