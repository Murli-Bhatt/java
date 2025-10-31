//// Builds a binary tree from preorder array with -1 as null.
import java.util.*;

public class Trees1 {
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

    public static class BuildTree {
        int indx = -1;
        
        public Node buildTree(int nodes[]) {
            indx++;
            if (nodes[indx] == -1) {
                return null;                                 
            }
            Node nd = new Node(nodes[indx]);
            nd.left = buildTree(nodes);
            nd.right = buildTree(nodes);
            return nd;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 3, 10, -1, -1, -1, 14, -1, 12,-1,-1 };
        BuildTree tree1 = new BuildTree();
        Node root = tree1.buildTree(nodes);
        System.out.println(root.data);

    }

}

