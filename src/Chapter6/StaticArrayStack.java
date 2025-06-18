package Chapter6;
import java.util.Queue;
import java.util.Stack;

public class StaticArrayStack
{
    private static final int DEFAULT_SIZE=10;
    //If I write the above snippet w/o the static final, there will be an error @line 10.
    //Why? Because, the value has not been initialised yet for the variable as in for an instance of an class
    private int [] data;
    private int ptr=-1;
    public StaticArrayStack()
    {
        this(DEFAULT_SIZE);
    }
    public StaticArrayStack(int size)
    {
        this.data=new int[size];
    }
    public boolean push(int num)
    {
        if(data.length==ptr-1)
        {
            System.out.println("Stack Overflow!!!");
            return false;
        }
        ptr++;
        data[ptr]=num;
        return true;
    }
    public int pop()
    {
        if(data.length==0)
        {
            System.out.println("Stack Underflow!!!");
            return -1;
        }
        System.out.println();
        int num=data[ptr];
        ptr=ptr-1;
        return num;
    }
    public int peek()
    {
        if(data.length==0)
        {
            System.out.println("The stack is empty!!!");
            return -1;
        }
        return data[ptr];
    }
    public void display()
    {
        for(int i=ptr;i>=0;i--)
        {
            System.out.println("|\t"+data[i]+"\t|");
        }
        System.out.println(" ________");
    }
}