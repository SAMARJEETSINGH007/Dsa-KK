package ArrayQuestions;

import java.util.Arrays;

public class ConcatenationOfArrays
{
    public static void main(String[] args)
    {
        int [] num = {1,2,1};
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(getConcatenation(num)));
    }
    public static int[] getConcatenation(int[] nums)
    {
        int [] ans = new int[2*nums.length];
        int i=0,j=0;
        for(i=0; i<nums.length;i++)
        {
            ans[j]=nums[i];
            j++;
        }
        for(i=0;i<nums.length;i++)
        {
            ans[j]=nums[i];
            j++;
        }
        return ans;
    }
}
