import javax.naming.directory.InitialDirContext;

public class DeleteNode {
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

    public static Node buildTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = buildTree(root.left, val);

        } else {
            root.right = buildTree(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static Node IS(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delteNode(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data > val) {
            root.left = delteNode(root.left, val);
        } else if (root.data < val) {
            root.right = delteNode(root.right, val);
        } else {
            // case1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            } else if(root.right ==null) {
                return root.left;
            }

            // case 3
            Node inSuc = IS(root);
            if (inSuc.left == null && inSuc.right == null) {
                return null;

            }
             else {
                if (inSuc.left == null) {
                    return inSuc.right;
                } else {
                    return inSuc.left;
                }

            }

        }
        return root;

    }

    public static void main(String[] args) {
        int[] nodes = { 8, 6, 7, 2, 3, 9, 10, 12 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = buildTree(root, nodes[i]);

        }

        System.out.println(root.data);
        inOrder(root);
        root = delteNode(root, 3);
        System.out.println();
        inOrder(root);

    }

}
