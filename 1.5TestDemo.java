public class TestDemo {
    public static void main(String[] args) {
        MyLinkedlist m = new MyLinkedlist();
        m.creat();
        m.display();
        Node newHead = m.findLast();
        System.out.println(newHead.val);
        Node newHead2 = m.findLastwo();
        System.out.println(newHead2.val);
        Node newHead3 = m.findFirst();
        System.out.println(newHead3.val);
        System.out.println(m.num());
        System.out.println(m.findkey(40));
    }
}
