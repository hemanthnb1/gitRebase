
class node
{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.left=null;
        this.right=null;
        this.data=data;

    }

    void preOrderTraversal(node root)
    {
        if(root==null)
        return;
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
public class temp
{
    public static void main(String[] args) {
        node root= new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.preOrderTraversal(root);
    }
}