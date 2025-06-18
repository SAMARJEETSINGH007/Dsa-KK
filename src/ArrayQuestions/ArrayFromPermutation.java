package ArrayQuestions;
import java.util.Arrays;

public class ArrayFromPermutation 
{
    public static void main(String [] args)
    {
        int [] arr1 = {0,1,3,4,2};
        System.out.println(Arrays.toString(arr1));
        int [] arr2=buildArray(arr1);
        System.out.println(Arrays.toString(arr2));
    }
    public static int [] buildArray(int [] num) {
        int[] ans =new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
        }
        return ans;
    }
}
/*
class solution1
{

	}
}
* */
