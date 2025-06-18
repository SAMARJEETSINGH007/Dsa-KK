package Chapter4;
import java.util.Scanner;
public class myDoublyLinkedList
{
    private class NodeDLL
    {
        private NodeDLL next,prev;
        int value;
        public NodeDLL(int value)
        {
            this.value=value;
        }
        public NodeDLL(int value,NodeDLL next,NodeDLL prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
    private NodeDLL head;
    int size=0;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~INSERT FUNCTIONS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void insertFirst(int val)
    {
        NodeDLL node=new NodeDLL(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
        size++;
    }
        public void insertLast(int val)
        {
            if(head==null)
            {
                insertFirst(val);
                return;
            }
            NodeDLL node=new NodeDLL(val);
            NodeDLL ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=node;
            node.prev=ptr;
            node.next=null;
            size+=1;
        }
    public void insertAtPos(int val,int index)
    {
        NodeDLL node;
        if(index-1==0)
        {
            insertLast(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        NodeDLL ptr=head;
        int i=0;
        while(i<index-2)
        {
            ptr=ptr.next;
            i++;
        }
        node=new NodeDLL(val,ptr.next,ptr);
        //node.next=ptr.next;
        //node.prev=ptr;
        ptr.next.prev=node;
        ptr.next=node;

        size++;
        //display();
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DELETE FUNCTIONS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public int deleteFirst()
    {
        NodeDLL ptr=head;
        int val=ptr.value;
        ptr.next.prev=null;
        head=ptr.next;
        size--;
        return val;
    }
    public int deleteLast()
    {
        NodeDLL ptr=head;
        while(ptr.next.next!=null)
        {
            ptr=ptr.next;
        }
        int val=ptr.next.value;
        ptr.next=null;
        size--;
        return val;
    }
    public int deleteAtPos(int index)
    {
        if(index-1==0)
        {
            deleteFirst();
        }
        if(index==size)
        {
            deleteLast();
        }
        int i=0;
        NodeDLL ptr=head;
        while(i<index-2)
        {
            ptr=ptr.next;
            i++;
        }
        int val=ptr.next.value;
        ptr.next.next.prev=ptr;
        ptr.next=ptr.next.next;
        size--;
        return val;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DISPLAY FUNCTION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void display()
    {
        if(size==1)
        {
            System.out.println("NULL<-"+head.value+"->NULL");
        }
        int i=0;
        NodeDLL node=head;
        System.out.print("NULL<-");
        while(node!=null)
        {
            if(i==0)
            {
                System.out.print("["+node.value+"]"+"<=>");
                node=node.next;
                i++;
            }
            else if (i==size-1)
            {
                System.out.print("["+node.value+"]");
                node=node.next;
            }
            else
            {
                System.out.print("["+node.value+"]"+"<=>");
                node=node.next;
                i++;
            }
//            System.out.print("["+node.value+"]");
//            node=node.next;
//            if(node!=null)
//            {
//                System.out.print("<=>");
//            }
        }
        System.out.print("->NULL\n");
    }
    public void reverse()
    {
        if(size==1)
        {
            System.out.println("NULL<-"+head.value+"->NULL");
        }
        NodeDLL node=head;
        System.out.print("The forward DLL you have entered is:\n");
        display();
        while(node.next!=null)
        {
            node=node.next;
        }
        System.out.print("NULL<-");
        while(node!=null)
        {
//            if(node.next==null)
//            {
//                System.out.print("["+node.value+"]<=>");
//                node=node.prev;
//            }
//            if(node.prev==null)
//            {
//                System.out.print("["+node.value+"]");
//                node=node.prev;
//            }
//            else
//            {
//                System.out.print("["+node.value+"]<=>");
//                node=node.prev;
//            }
            System.out.print("["+node.value+"]");
            node=node.prev;
            if(node!=null)
            {
                System.out.print("<=>");
            }
        }
        System.out.print("->NULL");
        System.out.println();
    }
}