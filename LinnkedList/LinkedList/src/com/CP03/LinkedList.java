package com.CP03;

public class LinkedList {
   static Node head;

   static class Node{
       int data;
       Node next;

       public Node(int data){
           this.data = data;

       }
   }
   //insertAtFirst

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    // insertAtEnd

    public void insertAtEnd(int val){
       Node node = new Node(val);

        if (head == null){
            head = node;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    // insertAtPosition

    public void insertAtPosition(int val,int index){
       Node node = new Node(val);

       if (head == null){
           head = node;
       }
       if (index == 0){
           insertAtFirst(val);
       }
       else {
           Node temp = head;

           for (int i = 0; i < index - 1; i++) {
               temp = temp.next;
           }

           if (temp == null) {
               System.out.println("Index out of bound");
           } else {
               node.next = temp.next;
               temp.next = node;
           }

       }
   }

   // Delete FirstNode

    public void deleteFirst(){
       if (head == null){
           System.out.println("LL is Empty");
       }
        head = head.next;
    }
    public void deleteLast(){
       if (head == null){
           System.out.println("LL is Empty");
       }
       // if there is a one node : make head to null
        if (head.next == null){
            head = null;
        }

        // At last

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

   public void display(){
        if (head == null){
            System.out.println("List is Empty");
        }

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
   }

   public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.insertAtFirst(10);
        LL.insertAtFirst(20);
        LL.insertAtEnd(30);
        LL.insertAtPosition(40,1);
        System.out.println("Before First Node delete");
        LL.display();

        LL.deleteFirst();
       System.out.println("After first delete");
       LL.display();
       System.out.println("End delete");

       LL.deleteLast();
       LL.display();



   }

}
