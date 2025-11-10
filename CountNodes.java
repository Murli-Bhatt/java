import java.util.*;
public class CountNodes {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }

    public static class Trees {
        int indx = -1;

        public Node buildTree(int[] nodes) {
            indx++;
            if (nodes[indx] == -1) {
                return null;

            }
            Node root = new Node(nodes[indx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;

        }

    }

    public static int countNodes(Node root) {

        if (root == null) {

            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 3, 10, -1, -1, -1, 14, -1, 12, -1, -1 };
        Trees tree1 = new Trees();
        Node root = tree1.buildTree(nodes);
        System.out.println(root.data);
        int total = countNodes(root);
        System.out.println(total);

    }

}
