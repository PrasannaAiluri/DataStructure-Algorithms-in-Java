package Algo.codingpatterns.slidingwindow;

/*
Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
 */
public class MaximumSumSubArray {

    public static void main(String[] args){

      int[] arr =  {2,3,4,1,5};
      int k=2;
      getMaximumSum(2,arr);
    }

    static int getMaximumSum(int k,int[] arr){

        /*
        1. calculate first k sum
        2. repeat for next element by sbtracting first and adding next.
        3. continue till last elemnt.
         */
        int windowSum = 0, maxSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }

        return maxSum;
    }



}
