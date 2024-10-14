package com.CP03;

public class LinkedList {
    Node head;

    static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
//        public Node(int value,Node next){
//            this.value = value;
//            this.next = next;
//        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void display(){
        if (head == null){
            System.out.println("List is Empty");

        }

        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.insertFirst(10);
        LL.insertFirst(20);

        LL.display();
    }

}
