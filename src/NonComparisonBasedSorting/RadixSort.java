import java.util.Scanner;
package NonComparisonBasedSorting;
public class RadixSort
{
	static 	int [] arr;
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter the array @ "+(i+1)+"th position!");
			arr[i]=sc.nextInt();
		}
		int placeValue=1;
		int maxNumber=findMaxNumber(arr);
		int maxNumber_DigitCount=digitCount(maxNumber);
		System.out.println(maxNumber+"<->"+maxNumber_DigitCount);
		while(maxNumber_DigitCount-- > 0)
		{
			countSort(arr,placeValue);
			placeValue*=10;
		}
		System.out.print("Sorted Array-->\n[");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.print("]");
	}
	public static int findMaxNumber(int [] arr)
	{
		int max=arr[0];
//		This is just simple linear search to find the maximum number!!!
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int digitCount(int num)
	{
		int count=0;
		for(int exp=1;num/exp>0;exp*=10)
		{
			count++;
		}
		return count;
	}
	public static void countSort(int [] arr,int placeValue)
	{
		int [] frequency=new int[10];
//		Three things are to be done ie the mainting of the frequency the running/cumulative sum and the sortedValues
		for(int i=0;i<arr.length;i++)
		{
			frequency[(arr[i]/placeValue)%10]++;
		}
		for(int j=1;j<10;j++)
		{
			frequency[j]+=frequency[j-1];
		}
		int [] sortedValue=new int[arr.length];
		for(int k=arr.length-1;k>=0;k--)
		{
			sortedValue[frequency[(arr[k]/placeValue)%10]-1]=arr[k];
			frequency[(arr[k]/placeValue)%10]--;
		}
		System.arraycopy(sortedValue,0,arr,0,arr.length);
	}
}

