/*
*
* 无头单向非循环链表实现
*
 */
class Node {
    public int val;
    public Node next;
    public Node (){
    }
    public Node (int val){
        this.val = val;
    }


}



public class MyLinkedlist {
    Node head ;

    //打印链表
    public void display(){
        if(this.head == null){
            System.out.println("head == null");
            return;
        }
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }


    //头插法
    public void addFirst(int data){
        Node n = new Node(data);
        if(this.head == null){
            this.head = n;
        }else{
            n.next = this.head;
            this.head = n;
        }
     }
    //尾插法
    public void addLast(int data){
        Node n = new Node(data);
        if(this.head == null){
            this.head = n;
            return;
        }
        Node cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = n;
    }




    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index <= 0){
            System.out.println(index+"位置不合法，无法插入");
            return;
        }
        if(index == 1){
            addFirst(data);
            return;
        }
        Node n = new Node(data);
        Node cur = this.head;
        int k = index;
        while(k - 2 > 0 && cur != null){
            cur = cur.next;
            k--;
        }
        if(cur == null){
            System.out.println(index+"位置不合法，无法插入");
            return;
        }
        n.next = cur.next;
        cur.next = n;
    }








    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if(this.head == null){
            System.out.println("head == null");
            return false;
        }
        Node cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null){
            System.out.println("head == null");
            return;
        }
        if(this.head.val == key){
            if(this.head.next == null){
                System.out.println("此链表只有"+key+".");
                this.head = null;
                return;
            }
            this.head = this.head.next;
        }
        Node cur = this.head;
        while(cur.next != null){
            if(cur.next.val == key){
                cur.next = cur.next.next;
            }
            if(cur.next == null){
                return;
            }
            cur = cur.next;
        }
    }



    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(this.head == null){
            System.out.println("head == null");
            return;
        }
        Node newHead = new Node(-1);
        Node n = newHead;
        Node cur = this.head;
        while(cur != null){
            if(cur.val == key){
                cur = cur.next;
            }else{
                n.next = cur;
                cur = cur.next;
                n = n.next;
            }
        }
        n.next = null;
        this.head = newHead.next;
    }






















}
