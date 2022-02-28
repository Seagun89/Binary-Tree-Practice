public class Run 
{
    public static void main(String[] args) 
    {
        Node root = new Node(17);
        int[] nodes = new int[]{10, 12, 8, 6, 2, 1, 23, 26};
        for (int i = 0; i < nodes.length; i++)
            root.insert(nodes[i]);
        System.out.println("depth-first Traversal");
        System.out.println("---------------------");
        System.out.println("InOrder Traversal");
        System.out.println("---------------------");
        root.inOrder();
        System.out.println("---------------------");
        System.out.println("preOrder Traversal");
        System.out.println("---------------------");
        root.preOrder();
        System.out.println("---------------------");
        System.out.println("postOrder Traversal");
        System.out.println("---------------------");
        root.postOrder();
        System.out.println("----------------------");
        System.out.println("breath-first Traversal");
        System.out.println("----------------------");
        System.out.println("level Order");
        System.out.println("----------------------");
        root.levelOrder();
        System.out.println("----------------------");
        System.out.println("Contain Method");
        System.out.println("----------------------");
        System.out.println(root.contains(10));
        System.out.println(root.contains(11));

    }
}