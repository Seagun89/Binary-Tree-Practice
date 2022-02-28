import java.util.*;
public class Node
{
    private Node left, right;
    private int data;
    // constructor
    // public Node()
    // {
    //     // empty cnstructor
    // }
    // overloaded constructor
    public Node(int item)
    {
        this.data = item;
        this.left = null;
        this.right = null;
    }
    // insert method
    public void insert(int value)
    {
        if (value < data)
        {
            if (left == null)
            {
                left = new Node(value);
            }
            else
            {
                left.insert(value);
            }
        }
        else 
        {
            if (right == null)
            {
                right = new Node(value);
            }
            else 
            {
                right.insert(value);
            }
        }
    }
    // delete method 
    public void delete(int value)
    {
        // pass
    }
    // contains method
    public boolean contains(int value)
    {
        if (value == data)
        {
            return true;
        }
        else if (value < data)
        {
            if (left == null)
            {
                return false;
            }
            else
            {
                return left.contains(value);
            }
        }
        else
        {
            if (right == null)
            {
                return false;
            }
            else 
            {
                return right.contains(value);
            }
        }
    }
    /* depth-first traversal */
    // inOrder method
    public void inOrder()
    {
        if (left != null)
        {
            left.inOrder();
        }
        System.out.println(data);
        if (right != null)
        {
            right.inOrder();
        }
    }
    //preOrder method
    public void preOrder()
    {
        System.out.println(data);
        if (left != null)
        {
            left.preOrder();
        }
        if (right != null)
        {
            right.preOrder();
        }
    }
    // postOrder method
    public void postOrder()
    {
        if (left != null)
        {
            left.postOrder();
        }
        if (right != null)
        {
            right.postOrder();
        }
        System.out.println(data);
    }
    /* breadth-first traversal */ 
    public void levelOrder()
    {
        Queue <Integer> queue = new LinkedList<Integer>();
        queue.add(data);
        while (!queue.isEmpty())
        {
            int tempNode = queue.poll();
            System.out.println(tempNode + "\n");
            
            if(left != null)
            {
                left.levelOrder();
            }
            if (right != null)
            {
                right.levelOrder();
            }
            
        }
    }
}