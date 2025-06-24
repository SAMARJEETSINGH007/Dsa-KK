package ArrayQuestions;
public class LeaderQuestion
{
    static int [] arr;
    static int [] result;
    static int resultpointer=0;
    public static void main(String [] args)
    {
        arr=new int[]{12,34,55,1,20,11};
        result=new int[arr.length];
   	/*
	for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    break;
                }
                if(j== arr.length-1)
                {
                    result[resultpointer]=arr[i];
                    resultpointer++;
                    break;
                }
            }
        }*/

        for(int k:result)
        {
            if(k==0)
            {
                continue;
            }
            System.out.print("{"+k+"}");
        }
    }
    public static void LeaderQuestionIm()
    {
	    int j=0;
	    int key;
	   for(int i=arr.length;i>0;i--)
	   {
		   j=i-1;
		   if(arr[j]>arr[i])
		   {
			arr[j]=result[resultpointer]; 
		   }
	   }
    }
}





