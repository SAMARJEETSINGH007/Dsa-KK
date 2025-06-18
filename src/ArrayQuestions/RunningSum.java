package ArrayQuestions;
import java.util.Arrays;
public class RunningSum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};

        System.out.println(Arrays.toString(runningSum_efficient(num)));
        System.out.println(Arrays.toString(runningSum_mine(num)));
    }

    public static int[] runningSum_efficient(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
    public static int[] runningSum_mine(int[] nums)
    {
        int [] rs = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            rs[i]=nums[i]+sum;
            sum=sum+nums[i];
        }
        return rs;
    }
}
