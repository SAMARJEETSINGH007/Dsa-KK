package DivideAndConquer;
//import java.util.Scanner;
public class MaxMinDnC
{
	static class Pair
	{
		int max;
		int min;
	}
	public static void main(String [] args)
	{
		int [] arr = {12,321,1,23,0};
		Pair minmax = getMinMax(arr,0,arr.length-1);
		System.out.println("Max element is "+minmax.max);
		System.out.println("Min element is "+minmax.min);
	}
	public static Pair getMinMax(int [] arr,int i, int j)
	{
		Pair mm=new Pair();
		Pair mr=new Pair();
		Pair ml=new Pair();
		int mid;
		if(i==j)//SMALL PROBLEM
		{
			mm.max=mm.min=arr[i];
			return mm;
		}
		if(i==j-1)
		{
			mm.max=arr[i]>arr[j]?arr[i]:arr[j];
			mm.min=arr[i]>arr[j]?arr[j]:arr[i];
			return mm;
		}
		else
		{
			mid=(i+j)/2;
			ml=getMinMax(arr,i,mid);
			mr=getMinMax(arr,mid+1,j);
			mm.max=ml.max>mr.max?ml.max:mr.max;
			mm.min=ml.min<mr.min? ml.min : mr.min;
		}
		return mm;
	}
}
