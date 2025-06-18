package ComparisonBasedSorting;
import java.util.Scanner;
public class BubbleSort
{
    private int [] arr;
    private int BubbleSortNaivecount;
    private int BubbleSortNaiveImcount;
    private int BubbleSortOptimumCount;
    public BubbleSort(int n)
    {
        Scanner sc = new Scanner(System.in);
        arr = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Please enter the " +(i+1)+ " th element");
            arr[i] = sc.nextInt();
        }
    }
    public void BubbleSortNaive()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                BubbleSortNaivecount++;
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1);
                }
            }
        }
        for (int j : arr) {
            System.out.print("|"+j);
        }
        System.out.println("\n"+BubbleSortNaivecount);
    }
    public void BubbleSortNaiveImproved()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length-1-i;j++)
            {
                BubbleSortNaiveImcount++;
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1);
                }
            }
        }
        for (int j : arr) {
            System.out.print("|"+j);
        }
        System.out.println("\n"+BubbleSortNaiveImcount);
    }
    public void BubbleSortOptimum()
    {
        for(int i=0;i< arr.length-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<arr.length-i-1;i++)
            {
                BubbleSortOptimumCount++;
                if(arr[j]>arr[j+1])
                {
                    flag=false;
                    swap(j,j+1);
                }
            }
            if(flag)
            {
                break;
            }
        }
        System.out.println("\n"+BubbleSortOptimumCount);
    }
    public void swap(int first,int second)
    {
        arr[first]=arr[first]+arr[second];
        arr[second]=arr[first]-arr[second];
        arr[first]=arr[first]-arr[second];
    }
}