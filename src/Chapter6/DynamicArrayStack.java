package Chapter6;

public class DynamicArrayStack
{
    private int ptr=-1;
    private int [] data;
    private static final int DEFAULT_SIZE=10;
    public DynamicArrayStack()
    {
        this(DEFAULT_SIZE);
    }
    public DynamicArrayStack(int size)
    {
        this.data=new int[size];
    }
    public void push(int num)
    {
        if(isFull())
        {
            resize();
        }
        ptr++;
        data[ptr]=num;
    }
    public int pop()
    {
        int num=data[ptr];
        ptr--;
        return num;
    }
    public boolean isFull()
    {
        return data.length==ptr+1;//*
    }
    public void resize()
    {
        int [] newdata= new int[2*data.length];
        System.arraycopy(data,0,newdata,0,data.length);
        this.data=newdata;
    }
    public int peek()
    {
        if(data.length==0)
        {
            System.out.println("Stack underflow!!!");
            return -1;
        }
        return data[ptr];
    }
    public void display()
    {
        if(data.length==0)
        {
            System.out.println("Stack underflow!!!");
            return;
        }
        for(int i=ptr;i>=0;i--)
        {
            System.out.println("|\t"+data[i]+"\t|");
        }
        System.out.println(" ________");
    }
}
