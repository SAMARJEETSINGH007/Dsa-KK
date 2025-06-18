package Chapter3;
import java.util.ArrayList;
import java.util.Arrays;
public class CustomArrayList
{
    private int[] data;
    private final int DEFAULT_SIZE=10;
    private static int size=0;
    public CustomArrayList()
    {
        this.data=new int[DEFAULT_SIZE];
    }
    //add
    public void add(int num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++] = num;
    }
    //remove
    public void remove()
    {
        int removedValue=data[--size];
    }
    //set
    public void set(int index,int value)
    {
        data[index]=value;
    }
    //get
    public int get(int index)
    {
        return data[index];
    }
    public Boolean isFull()
    {
        return size==data.length;
    }
    public void resize()
    {
        int [] temp=new int[2*data.length];
        System.arraycopy(data, 0, temp, data.length-1, data.length);
        this.data=temp;
    }
    public void type()
    {
        System.out.println(Arrays.toString(data));
    }
    public static void main(String[] args)
    {
        ArrayList<Integer>  list = new ArrayList<Integer>();
        list.add(10);
        CustomArrayList cl = new CustomArrayList();
        cl.add(10);
        cl.add(20);
        cl.add(30);
        cl.type();
        cl.remove();
        cl.type();
        cl.set(0,333);
        cl.type();
        cl.get(1);
        cl.type();
    }
}
