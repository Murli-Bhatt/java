import java.util.*;

public class BST01 {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            // this.left = null;
            // this.right = null;

        }
    }

    public static Node buildTree(Node root, int data) {
        if (root == null) {
            root = new Node(data);

           
            return root;

        }
      
        if (root.data > data) {
            root.left = buildTree(root.left, data);
        }
        else  {
            root.right = buildTree(root.right, data);
        }
        return root;

    }

    public static void main(String[] args) {
        int[] values = {
                7, 3, 4, 2, 9, 8, 12, 1, 5
        };
        Node root = null;
        for(int i =0;i<values.length;i++){
            root=buildTree(root, values[i]);
        }
       System.out.println(root.data);

    }

}
