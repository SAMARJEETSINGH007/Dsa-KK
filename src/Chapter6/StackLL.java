package Chapter6;
class Node
{
    Node prev;
    int val;
    public Node(int val)
    {
        this.val=val;
    }
}
public class StackLL
{
    private int size=0;
    private Node top;
    public void push(int num)
    {
        Node node = new Node(num);
        node.prev=top;
        top=node;
        size++;
    }
    public int pop()
    {
        if(size==0)
        {
            System.out.println("Stack Underflow!!!");
            return -1;
        }
        int num=top.val;
        top=top.prev;
        size--;
        return num;
    }
    public int peek()
    {
        if(size==0)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.val;
    }
    public void display()
    {
        if(size==0)
        {
            System.out.println("Stack Underflow!!!");
            return;
        }
        Node ptr=top;
        while(ptr!=null)
        {
            System.out.println("|\t"+ptr.val+"\t|");
            ptr=ptr.prev;
        }
        System.out.println(" ________");
    }
}
