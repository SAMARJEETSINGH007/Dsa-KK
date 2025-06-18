package Chapter4;
public class myCircularLinkedList
{
    private class NodeCLL
    {
        private NodeCLL next;
        int value;
        public NodeCLL(int value)
        {
            this.value=value;
        }
        public NodeCLL(int value,NodeCLL next)
        {
            this.value=value;
            this.next=next;
        }
    }
    private NodeCLL head,tail;
    int size=0;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~INSERT FUNCTIONS~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void insertFirst(int val)
    {
        NodeCLL node=new NodeCLL(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        tail.next=node;
        size++;
    }
    public void insertLast(int val)
    {
        NodeCLL node = new NodeCLL(val);
        tail.next=node;
        tail=node;
        tail.next=head;
    }
    public void insertAtPos(int val,int index)
    {
        if(size==0)
        {
            System.out.println("CLL is empty.");
            return;
        }
        if(index==1)
        {
            insertFirst(val);
            return;
        }
        else if(index==size)
        {
            insertLast(val);
            return;
        }
        NodeCLL node=new NodeCLL(val);
        int i=1;
        NodeCLL ptr=head;
        while(i<index-1)
        {
            ptr=ptr.next;
            i++;
        }
        node.next=ptr.next;
        ptr.next=node;
        size++;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DELETE FUNCTIONS~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public int deleteFirst()
    {
        int val=head.value;
        head=head.next;
        tail.next=head;
        return val;
    }
    public int deleteLast()
    {
        NodeCLL ptr=head;
        while(ptr.next.next!=head)
        {
            ptr=ptr.next;
        }
        System.out.println("currrent value-->"+ptr.value);
        int val=ptr.next.value;
        ptr.next=head;
        tail=ptr;
        return val;
    }
    public int deleteAtPos(int index)
    {
        if(index==1)
        {
            return deleteFirst();
        }
        else if(index==size)
        {
            return deleteLast();
        }
        NodeCLL ptr= head;
        int i=1;
        while(i<index-1)
        {
            ptr=ptr.next;
            i++;
        }
        int val=ptr.next.value;
//        System.out.println(ptr.next.next.value);
        ptr.next=ptr.next.next;
        size--;
        return val;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DISPLAY FUNCTIONS~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void display()
    {
        int i=0;
        if(size==0)
        {
            System.out.println("The CLL is empty");
            return;
        }
        if(size==1)
        {
            System.out.println("..."+head.value+"<-["+head.value+"]->"+head.value+"...");
            return;
        }
        NodeCLL ptr= head;
        System.out.print("...["+tail.value+"]<~~");
//        while(i<size-1)
//        {
//            System.out.print("["+ptr.value+"]");
//            ptr=ptr.next;
//            if(ptr.next!=head)
//            {
//                System.out.print("->");
//            }
//            i++;
//        }
        do
        {
            System.out.print("["+ptr.value+"]");
            if(ptr.next!=head)
            {
                System.out.print("->");
            }
            ptr=ptr.next;

        }
        while(ptr!=head);
        System.out.print("~~>["+head.value+"]...\n");
    }
/*FOREVER FOR LOOP
    for(;;)//there isnt any conditional, nor initialisation nor the updatation. This loop is essentialy an infinite loop and can be exited onluy if we use break
    {
        System.out.println(" "+ptr.data);//ptr is initialised at head
        ptr=ptr.next;
        if(ptr==head)
        {
            break;
        }
    }
* */
}
