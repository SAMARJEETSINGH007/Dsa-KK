package Chapter3;
import java.util.Arrays;
public class CustomArrayListGeneric
{
    public static void main(String[] args)
    {
        myGenericArray <Integer> arr = new myGenericArray<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.get(0));
        arr.set(0,33);
        System.out.println(arr.remove());
        arr.type();
        System.out.println("~~~~~~~~~~~~~~~~~");
        myGenericArray <String> arr1 = new myGenericArray<>();
        arr1.type();
        arr1.add("Hello");
        arr1.type();
        arr1.add("My name is");
        arr1.type();
        arr1.add("Samar");
        arr1.type();
        System.out.println(arr1.get(0));
        arr1.set(2,"Palkin");
        arr1.type();
        System.out.println(arr1.get(2));
        System.out.println(arr1.remove());
        arr1.type();
    }
}
class myGenericArray <T>
{
    private T [] arr;
    private int size;
    private int capacity;
    private int DEFAULT_SIZE=10;
    myGenericArray()
    {
        this.capacity=this.DEFAULT_SIZE;

        arr=(T [])new Object [capacity];//We need to typecast the arr of objects because the JVM at compile time replaces the T with the Object and as
//        such the T doesn't exist. This is called as type erasure. Now to tell the JVM that "Ok i know that this is an array of Objects, but i want it to be
//        treated as an array of the generic type T[]"
/*The @SuppressWarnings("unchecked") annotation in Java is used to inform the compiler to ignore
specific warnings related to unchecked operations, particularly when dealing with generics and type casting*/
    }
    public void add(T element)
    {
        if(capacity==size)
        {
            resize();
        }
        arr[size++]=element;
    }
    public void resize()
    {
        T [] temp = (T []) new Object [2*capacity];
        System.arraycopy(arr,0,temp,0,capacity);
        arr=temp;
    }
    public T remove()
    {
        if(size==0)
        {
            throw new IndexOutOfBoundsException("Array is Empty");
        }
        T removedElement =  arr[--size];
        arr[size]=null;
        return removedElement;
    }
    public void set(int index,T element)
    {
        arr[index]=element;
    }
    public T get(int index)
    {
        return arr[index];
    }
    public void type()
    {
        System.out.println(Arrays.toString(arr));
    }
}