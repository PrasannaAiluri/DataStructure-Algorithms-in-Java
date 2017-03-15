package dynamicprogramming;

public class LongestIncreasingSubSequence {

	public static void main(String[] args)
	{
		int[] nums={10, 9, 2, 5, 3, 7, 101, 18};
		lengthOfLIS(nums);
	}

	static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(" ,"+arr[i]);
	}
	
	public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        //new array to hold elements of longest subsequnece
        int[] dp = new int[nums.length];
       // initializing first element with 1
        dp[0] = 1;
        
        int maxans = 1;
        
        for (int i = 1; i < dp.length; i++) {
        	
            int maxval = 0;
            
            for (int j = 0; j < i; j++) {
            
                System.out.println("nums[i]="+nums[i]);
                System.out.println("nums[j]="+nums[j]);
                if (nums[i] > nums[j]) {
                	System.out.println("true "+nums[i]+">" + nums[j]);
                	System.out.println("maximum"+maxval+"or"+ dp[j]);
                    maxval = Math.max(maxval, dp[j]);
                    System.out.println("maxval="+maxval);
                }
            }
            dp[i] = maxval + 1;
            System.out.println("dp is=");
            print(dp);
            maxans = Math.max(maxans, dp[i]);
            System.out.println("maxans="+maxans);
        }
        return maxans;
    }
	
}
