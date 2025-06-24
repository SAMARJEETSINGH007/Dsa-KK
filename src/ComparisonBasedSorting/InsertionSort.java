package ComparisonBasedSorting;
import java.util.Scanner;
public class InsertionSort
{
    int [] arr;
    int key;
    public InsertionSort(int n)
    {
           arr=new int[n];
           Scanner sc = new Scanner(System.in);
           for(int i=0;i<n;i++)
           {
               System.out.println("Please enter the " + (i + 1) + "th element");
               arr[i] = sc.nextInt();
           }
    }
    public void sort()
    {
        for(int i=1;i<arr.length;i++)
            {
            int k=i-1;
            key=arr[i];
            while(k>-1 && arr[k]>key)
            {
                arr[k+1]=arr[k];
                k--;
            }
            arr[k+1]=key;
        }
        for(int j:arr)
        {
            System.out.print("|"+j);
        }
    }
}