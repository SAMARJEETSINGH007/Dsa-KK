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
        System.out.println("Naive algo");
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
        for (int j : arr)
        {
            System.out.print("|"+j);
        }
        System.out.println("\n"+BubbleSortNaivecount);
    }
    public void BubbleSortNaiveImproved()
    {
        System.out.println("Naive algo improved");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
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
        System.out.println("Optimum algo");
        for(int i=0;i< arr.length-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<arr.length-i-1;j++)
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
        for(int k:arr)
        {
            System.out.print("|"+k);
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