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
    Node head;

    //打印链表
    public void display() {
        if (this.head == null) {
            System.out.println("head == null");
            return;
        }
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //头插法
    public void addFirst(int data) {
        Node n = new Node(data);
        if (this.head == null) {
            this.head = n;
        } else {
            n.next = this.head;
            this.head = n;
        }
    }

    //尾插法
    public void addLast(int data) {
        Node n = new Node(data);
        if (this.head == null) {
            this.head = n;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = n;
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

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
    // 重复的结点不保留，返回链表头指针
    public Node deleteSame(){
        if(this.head == null){
            System.out.println("head == null");
            return null;
        }
        if(this.head.next == null){
            return null;
        }
        Node newHead = new Node(-1);
        Node n = newHead;
        Node cur = this.head;
        while(cur.next != null){
            if(cur.val != cur.next.val) {
                n.next = cur;
                n = n.next;
            }
            while(cur.val == cur.next.val){
                cur = cur.next;
                if(cur.next == null){
                    n.next = null;
                    this.head = newHead.next;
                    return this.head;
                }
            }
            cur = cur.next;
        }
        n.next = cur;
        this.head = newHead.next;
        return this.head;
         }


         //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public void Partition(int x){
        if(this.head == null){
            System.out.println("head == null");
            return;
        }
        if(this.head.next == null){
            return;
        }
        Node cur = this.head;
        Node newhead1 = new Node(-1);
        Node n1 = newhead1;
        Node newhead2 = new Node(-1);
        Node n2 = newhead2;
        while(cur != null){
            if(cur.val <= x){
                n1.next = cur;
                n1 = n1.next;
            }else {
                n2.next = cur;
                n2 = n2.next;
            }
            cur = cur.next;
        }
        n1.next = newhead2.next;
        n2.next = null;
        this.head = newhead1.next;
    }

    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public void connect(Node m1, Node m2){
        if(m1 == null){
            return;
        }else if(m2 == null){
            return;
        }
        Node newhead = new Node(-1);
        Node n = newhead;
        while(m1.next != null && m2.next != null){
            if(m1.val >= m2.val){
                n.next = m2;
                m2 = m2.next;
                n = n.next;
            }else{
                n.next = m1;
                m1 = m1.next;
                n = n.next;

            }
        }
        if(m1.next == null){
            if(m1.val < m2.val){
                m1.next = m2;
                n.next = m1;
            }else{
                while(m1.val >= m2.val){
                    n.next = m2;
                    m2 = m2.next;
                    n = n.next;
                    if(m2 == null){
                        n.next = m1;
                        this.head = newhead.next;
                        return;
                    }
                }
                m1.next = m2;
                n.next = m1;
            }

        }
        if(m2.next == null){
            if(m2.val < m1.val){
                m2.next = m1;
                n.next = m2;
            }else{
                while(m2.val >= m1.val) {
                    n.next = m1;
                    m1 = m1.next;
                    n = n.next;
                    if(m1 == null){
                        n.next = m2;
                        this.head = newhead.next;
                        return;
                    }
                }
            }
            m2.next = m1;
            n.next = m2;
        }
        this.head = newhead.next;
    }
    //输入一个链表，输出该链表中倒数第k个结点
    public int RecNOK(int k){
        if(k <= 0){
            System.out.println("k is not legal!!");
            return -1;
        }
        Node prev = this.head;
        Node cur = this.head;
        while(k-1 > 0){
            cur = cur.next;
            if(cur == null){
                System.out.println("k is so big!");
                return -1;
            }
            k --;
        }
        while(cur.next != null){
            cur = cur.next;
            prev = prev.next;
        }
        return prev.val;
    }

    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
    public int middle(){
        if(this.head == null){
            System.out.println("head == null");
            return -1;
        }

        int ret = 0;
        int num = 0;
        Node tmp = this.head;
        while(tmp != null){
            num++;
            tmp = tmp.next;
        }
        Node cur = this.head;
        if(num % 2 == 0){
            int k = num / 2 + 1;
            while(k > 1){
                k--;
                cur = cur.next;
            }
        }else{
            int k = (num + 1) / 2;
            while(k > 1){
                k--;
                cur = cur.next;
            }
        }
        return cur.val;
    }



    //反转一个单链表
    public void reverse(){
        if(this.head == null){
            System.out.println("head==null");
            return;
        }
        if(this.head.next == null){
            return;
        }
        if(this.head.next.next == null){
            Node cur = this.head.next;
            cur.next = this.head;
            this.head.next = null;
            this.head = cur;
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        Node seq = this.head.next.next;
        this.head.next = null;
        while(seq != null) {
            cur.next = prev;
            prev = cur;
            cur = seq;
            seq = seq.next;
        }
        cur.next = prev;
        this.head = cur;
    }




























    }