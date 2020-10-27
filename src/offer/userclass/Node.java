package offer.userclass;

import offer.offer02;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public void hello() {
        System.out.println("我是由 " + getClass().getClassLoader().getClass() + " 加载的");
    }
    //打印
    public  static  void getNode(Node head){
        while (true){
            System.out.println(head.getData());
            if (head.getNext()==null){break;}
            head=head.getNext();
        }
    }
    //递归反转
     public  static  Node recurson(Node head){
        //递归结束条件
        if (head==null || head.getNext()==null){
            return head;
        }
         Node recurson = recurson(head.getNext());
         Node next = head.next;
         next.next=head;
         head.next=null;
         return recurson;
     }
}

