package ComparisonBasedSorting;

import java.util.Scanner;

public class SelectionSort
{
    int [] arr;
    int min_index;
    public SelectionSort(int n)
    {
        Scanner sc = new Scanner(System.in);
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Please enter the "+(i+1)+"th element");
            arr[i]=sc.nextInt();
        }
    }
    public void sort()
    {
        System.out.println("Starting sorting.");
        for(int i=0;i<arr.length-2;i++)
//        arr.length-2 because we have started from zero and want to go till (n-1)th element. )ki wajah se ek -1 aur n-1 ki wajah se doosra -1.
        {
            min_index=i;
            for(int j=i+1;j<arr.length;j++)
                //notes:1. Make sure that it is j++ rather than i++ you made this mistake in Bubble sort also
//                2. in here we go for j+i+1 because till i in the ith iteration, the smallest element is already sorted a
//                and to avoid comparing the element with itself, we do +1
//                we go till arr.length than arr.length-1 because we are starting from 1 as i+1 is there so even if i=0 it has j=i+1
            {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            swap(i,min_index);
        }
        for(int k:arr)
        {
            System.out.print("|"+k);
        }
    }
    public void swap(int a,int b)
    {
        arr[a]=(arr[a]+arr[b])-(arr[b]=arr[a]);
    }
}
