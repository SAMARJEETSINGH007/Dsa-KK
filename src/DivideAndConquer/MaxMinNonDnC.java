package DivideAndConquer;
import java.util.Scanner;
public class MaxMinNonDnC
{
	static int [] arr;
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		MaxMin(arr);
	}
	public static void MaxMin(int [] arr)
	{
		int max,min;
		max=min=arr[0];
        for(int l:arr)
		{
			if(l>max)
			{
				max=l;
			}
			else if(l<min)
			{
				min=l;
			}
		}
		System.out.println("The max and min elements are "+max+" "+min+" respectively");
		for(int j: arr)
		{
			System.out.print(j+" ");
		}
	}
}
