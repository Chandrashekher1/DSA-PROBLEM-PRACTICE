import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;

        // constructor
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    // Insert Element
    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);

    }
    private void populate(Scanner sc, Node temp){
        System.out.println("Do you want to Enter left of " + temp.value);
        System.out.println("Write true or false only");
        boolean left = sc.nextBoolean();

        // left
        // check
        if (left){
            System.out.println("Enter the value of the left of" + temp.value);
            int value = sc.nextInt();
            temp.left = new Node(value);
            populate(sc, temp.left);
        }
        // for right

        System.out.println("Do you want to enter right of" + temp.value);
        boolean right = sc.nextBoolean();

        if (right){
            System.out.println("Enter the value of the right of " + temp.value);
            int value = sc.nextInt();
            temp.right = new Node(value);
            populate(sc,temp.right);
        }
    }


}
