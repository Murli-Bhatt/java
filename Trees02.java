public class Trees02 {
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
        static int indx = -1;

        public static Node buildTree(int[] arr) {
            indx++;
           
            if (arr[indx] == -1) {
                return null;
            }
             Node n1 = new Node(arr[indx]);
            n1.left = buildTree(arr);
            n1.right = buildTree(arr);

            return n1;

        }
    }
    public static void inTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        inTraversal(node.left);
        
        inTraversal(node.right);

    }

    public static void main(String[] args) {
         int nodes[] = { 8, 3, 10, -1, -1, -1, 14, -1, 12,-1,-1 };
        BuildTree tree1 = new BuildTree();
        Node root = tree1.buildTree(nodes);
        System.out.println(root.data);
        inTraversal(root);



    }

}
