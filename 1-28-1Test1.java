package 队列;

/*
* queue的初步学习
* queue下的接口有六个
* 分别为：add（）；  offer（）；  poll（）；   peek（）；  remove（）；  elemt（）；
*
* LinkedList类下的方法比较多，要熟悉；
*
*
* */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Test1{
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();

        //queue的增添元素的方法有两种，add和offer，习惯上用offer
        queue.offer(12);
        queue.offer(22);
        queue.offer(32);
        queue.offer(42);
        System.out.println(queue);

        //poll为弹出头元素
        Integer a = queue.poll();
        System.out.println(a);
        System.out.println(queue);

        //peek为复制并返回头节点元素，还有一个时element方法，与peek的区别就是当头节点为空时，element会显示异常；
        Integer b = queue.peek();
        System.out.println(b);
        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.poll());
        System.out.println(queue.remove());     //remove与poll的区别是当头为空时，remove会显示异常，poll返回为空


        System.out.println("-----------LinkedList---------------------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(12);
        linkedList.addLast(23);
        linkedList.addFirst(33);
        System.out.println(linkedList);

    }
}