package ComparisonBasedSorting;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        BubbleSort bsort=new BubbleSort(n);
        bsort.BubbleSortNaiveImproved();
        bsort.BubbleSortNaive();
        bsort.BubbleSortOptimum();
    }
}
