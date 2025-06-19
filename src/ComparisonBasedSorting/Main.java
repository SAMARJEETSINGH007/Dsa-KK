package ComparisonBasedSorting;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the arry size");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
//        BubbleSort bsort=new BubbleSort(n);
//        bsort.BubbleSortNaive();
//        bsort.BubbleSortNaiveImproved();
//        bsort.BubbleSortOptimum();
        SelectionSort sSort=new SelectionSort(n);
        sSort.sort();
    }
}