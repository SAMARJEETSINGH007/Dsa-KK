package Chapter6;
public class QueueArr {
    private final int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    private int end = 0;

    public QueueArr() {
        this(DEFAULT_SIZE);//refers to the constructor which has a parameter in it.
    }

    public QueueArr(int len) {
        this.data=new int[len];
    }

    public void enqueue(int num) {
        if (data.length == size) {
            System.out.println("Queue full!!!");
            return;
        }
        data[end] = num;
        size++;
        end++;
//        System.out.println(end);
    }

    public int dequeue() {
        if (data.length == 0) {
            System.out.println("Queue is Empty!!!");
            return -1;
        }
        int num = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[end-1] = 0;
        return num;
    }
    public int front()
    {
        return data[0];
    }

    public int rear() {
        return data[end-1];
    }

    public void display()
    {
        if(data.length==0)
        {
            System.out.println("The Queue is Empty!!!No element to show!!!");
            return;
        }
        for(int j=end-1;j>=0;j--)
        {
            System.out.print("_____");
        }
        System.out.println();
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+"->");
        }
        System.out.print("END");
        System.out.println();
        for(int j=end-1;j>=0;j--)
        {
            System.out.print("_____");
        }
        System.out.println("\n");
    }
    public int size() {
        return size;
    }
}