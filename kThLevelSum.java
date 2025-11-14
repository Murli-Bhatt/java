//it will count the sum of all nodes at the Kth level .

import java.util.*;
public class kThLevelSum {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left =null;
            this.right= null;

        }

    }
    static class BuildTree{
        static int indx =-1;
        public static Node buildTree(int[] nodes){
            indx++;
            if(nodes[indx] == -1){
                return null;

            }
            Node root = new Node(nodes[indx]);
            root.left = buildTree(nodes);
            root.right= buildTree(nodes);
            return root;
        }
    }
public static int countSum(Node root, int k) {
    if (root == null) return 0;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int level = 1;
    while (!q.isEmpty()) {
        int size = q.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            Node curr = q.poll();
            if (level == k) {
                sum += curr.data;
            }
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        if (level == k) return sum;
        level++;
    }
    return 0;
}

    public static void main(String[] args){
         int nodes[] = { 8, 3, 10, -1, -1, -1, 14, -1, 12,-1,-1 };
        BuildTree tree1 = new BuildTree();
        Node root = tree1.buildTree(nodes);
        int k = 2;
        int sum = countSum(root, k);
        System.out.println("Sum at level " + k + ": " + sum);
    }
    
}

