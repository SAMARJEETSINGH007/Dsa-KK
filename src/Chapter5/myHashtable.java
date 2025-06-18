package Chapter5;
//~~~~~~~~~~~~~~~~~~~~~~~~~~HASHTABLE~~~~~~~~~~~~~~~~~~~~~~
public class myHashtable
{
    private HashNode[] bucket;
    private int numOfBuckets;
    private int size;
    public myHashtable()
    {
        this.numOfBuckets=10;
        this.bucket=new HashNode[numOfBuckets];
    }
    public myHashtable(int numOfBuckets)
    {
        this.numOfBuckets=numOfBuckets;
        this.bucket=new HashNode[numOfBuckets];
    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~NODE CREATION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    private class HashNode
    {
        private Integer key;
        private String value;
        private HashNode next;
        public HashNode(Integer key,String value)
        {
            this.key=key;
            this.value=value;
        }
    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~SIZE~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public int returnSize()
    {
        return size;
    }
//~~~~~~~~~~~~~~~~~~~~~~~~~IS EMPTY~~~~~~~~~~~~~~~~~~~~~~~~~~
    public boolean isEmpty()
    {
        return size==0;
    }
//    public void put(Integer key,String value)
//    {
//        int bucketIndex=getkeyIndex(key);
//        HashNode head= bucket[bucketIndex];
//        while(head!=null)
//        {
//            if(head.key.equals(key))
//            {
//                head.value=value;
//                return;
//            }
//            head=head.next;
//        }
//        head=bucket[bucketIndex];
//        HashNode node = new HashNode(key,value);
//        node.next=head;
//        head=node;
//        size++;
//
//    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~INSERTION~~~~~~~~~~~~~~~~~~~~~~~~
public void put(Integer key, String value) {
    int bucketIndex = getkeyIndex(key);
    HashNode head = bucket[bucketIndex];
    // Check if the key already exists in the linked list
    while (head != null) {
        if (head.key.equals(key)) {
            head.value = value;  // Update value if the key exists
            return;
        }
        head = head.next;
    }
    // Create a new node if the key is not found
    HashNode newNode = new HashNode(key, value);
    newNode.next = bucket[bucketIndex];  // Point the new node to the current head
    bucket[bucketIndex] = newNode;       // Update the bucket to point to the new node
    size++;
}
//~~~~~~~~~~~~~~~~~~~~~~~GET KEY INDEX~~~~~~~~~~~~~~~~~~~~~~~~~
    public int getkeyIndex(int key)
    {
        return key%bucket.length;
    }
//~~~~~~~~~~~~~~~~~~~~~~~DISPLAY~~~~~~~~~~~~~~~~~~~~~
    public void display()
    {
        for(int i=0;i<bucket.length;i++)
        {
            System.out.print("index "+i+": ");
            HashNode head=bucket[i];
            while(head!=null)
            {
                System.out.print("{["+head.value+"],["+head.key+"]}--> ");
                head=head.next;
            }
            System.out.print("NULL");
            System.out.println();
        }
    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DELETION~~~~~~~~~~~~~~~~~~~~~~
//        boolean flag = false;
//        while (ptr != null) {
//            if (ptr.next.key.equals(key)) {
//                flag = true;
//                break;
//            }
//            ptr = ptr.next;
//        }
//        if (flag)
//        {
//            String name=ptr.next.value;
//            ptr.next=ptr.next.next;
//            size--;
//            return name;
//        }
//        else
//        {
//            return "NULL";
//        }
    public String remove(int key)
    {
        int v = key % bucket.length;
        HashNode ptr = bucket[v];

        if(ptr==null)
        {
            return "1)NULL/NO SUCH ELEMENT FOUND";
        }
        else if(ptr.key.equals(key))
        {
            String val=ptr.value;
            bucket[v]=ptr.next;
            size--;
            return "The value is "+val;
        }
        else
        {
            while(ptr.next!=null)
            {
                if(ptr.next.key.equals(key))
                {
                    //ptr=ptr.next;
                    String val=ptr.next.value;
                    ptr.next=ptr.next.next;
                    size--;
                    return "The value is "+val;
                }
                ptr=ptr.next;
            }
            return "2)NULL/NO SUCH ELEMENT FOUND";
        }
    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~SEARCH~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void get(int key)
    {
        int v= key%bucket.length;
        HashNode head= bucket[v];
        while(head!=null)
        {
            if(head.key.equals(key))
            {
                System.out.println("["+head.key+"],["+head.value+"] is present at the index "+v);
                return;
            }
            head=head.next;
        }
        System.out.println("NULL/NOT FOUND");
    }
}