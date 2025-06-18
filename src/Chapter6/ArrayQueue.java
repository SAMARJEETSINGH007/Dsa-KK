package Chapter6;

import java.util.Arrays;

public class ArrayQueue
{
    private int[] arr;
    private final static int DEFAULT_SIZE=10;
    //	private int len;
    int head,end=-1;
    public ArrayQueue(int len)
    {
        arr=new int[len];
    }
    public ArrayQueue()
    {
        this(DEFAULT_SIZE);
    }
    public void enqueue(int data)
    {
        if(end==arr.length)
        {
            System.out.println("Queue is full, resizing");
            this.resize();
        }
        if(end==-1)
        {
            arr[++end]=data;
            head=end;
            return;
        }
        arr[++end]=data;
        return;
    }
    public void resize()
    {
        int[] temp=new int[2*arr.length];
        System.arraycopy(arr,0,temp,0,arr.length-1);
    }
    public int dequeue()
    {
        int data=arr[head];
        for(int i=1;i<arr.length-1;i++)
        {
            arr[i-1]=arr[i];
        }
        end--;
        return data;
    }
    public void peek()
    {
        System.out.println(arr[head]);
        System.out.println(arr[end]);
    }
    public void type()
    {
        System.out.println(Arrays.toString(arr));
    }
}