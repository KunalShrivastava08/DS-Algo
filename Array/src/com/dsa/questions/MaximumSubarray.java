//Time complexity = O(n) , Space complexity= 0(1)
package com.dsa.questions;

public class MaximumSubarray {

	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum=maxSubArray(nums);
		System.out.println(sum);
		

	}
    
	 public static int maxSubArray(int[] nums)
	    {
	        int maxsum=nums[0];
	        int cursum=0;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            cursum+=nums[i];
	            if(cursum>maxsum){
	                maxsum=cursum;
	            }
	            if(cursum<0){
	                cursum=0;
	            }
	        
	        }
	        return maxsum;
	    }
}
