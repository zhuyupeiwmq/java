package offer;

import offer.userclass.Node;

import static offer.userclass.Node.recurson;

//反转单项链表
public class offer02 {
    public static void main(String[] args) {
        //1-2-3
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null);
        Node.getNode(node1);
        Node recurson = recurson(node1);
        Node.getNode(recurson);
    }


}
