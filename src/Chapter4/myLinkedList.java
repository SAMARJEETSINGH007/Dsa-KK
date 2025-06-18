package Chapter4;
import java.util.Scanner;
class Node
{
    int value;
    Node next;
    public Node(int val)
    {
        this.value=val;
    }
    public Node(int val,Node nd)
    {
        this.value=val;
        this.next=nd;
    }
}
class LL
{
    private Node head,tail;
    private int size;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DISPLAY THE LINKED LIST~~~~~~~~~~~~~~~~~~~~~~
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print("["+temp.value+"]"+"-> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~INSERT FUNCTIONS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void insertAtPos(int value,int pos)
    {
        if(pos==1)
        {
            insertFirst(value);
            size++;
            return;
        }
        pos--;
        int size1=1;
        Node ptr=head;
        while(size1<pos)
        {
            ptr=ptr.next;
            size1++;
        }
        Node node=new Node(value,ptr.next);
        ptr.next=null;
        ptr.next=node;
        size++;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DELETE FUNCTIONS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public int deleteFirst()
    {
        /*Node ptr = head;
        head=ptr.next;*/
        int val = head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        System.out.print("Deleted element is ");
        return val;
    }
    public int deleteLast()
    {
        /*Node ptr=head;
        int i=1;
        while(i<size-1)
        {
            i++;
            ptr=ptr.next;
        }
        int val=tail.value;
        tail=ptr;
        ptr.next=null;
        size--;*/
        if(size==1)
        {
            deleteFirst();
        }
        int val=tail.value;
        tail = get(size-2);
        tail.next=null;
        System.out.print("Deleted element is ");
        size--;
        return val;
    }
    public Node get(int index)
    {
        Node node= head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }
    public int deleteAtPos(int index)
    {
        if(index<1||index>size)
        {
            System.out.println("Please enter the index within the range of the linked list");
            return 0;
        }
        if(index==size)
        {
            return deleteLast();
        }
        if(index==1)
        {
            return deleteFirst();
        }
        Node ptr = get(index-2);
        int val=ptr.next.value;
        ptr.next=ptr.next.next;
        size--;
        System.out.println("The deleted element is ");
        return val;
    }
}
public class myLinkedList
{
    public static void main(String [] args)
    {
        LL ll1=new LL();
        ll1.insertFirst(10);
        ll1.insertFirst(20);
        ll1.insertFirst(30);
        ll1.insertFirst(40);
        ll1.insertFirst(50);
        ll1.insertLast(33);
        ll1.display();
        Scanner sc=new Scanner(System.in);
        //System.out.println("Please enter the value you wanna enter the new value in-->");
        //int value=sc.nextInt();
        //System.out.println("Please enter the position you wanna enter the new value in-->");
        //int pos = sc.nextInt();
        //ll1.insertAtPos(value,pos);
        //ll1.display();
        //System.out.println(ll1.deleteFirst());
        //ll1.display();
        //System.out.println(ll1.deleteLast());
        //ll1.display();
        System.out.println("Please enter the index of the element you wanna delete");
        int pos_delete=sc.nextInt();
        System.out.println(ll1.deleteAtPos(pos_delete));
        ll1.display();
    }
}
