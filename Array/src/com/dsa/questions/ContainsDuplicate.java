//Time complexity = O(n log n) , Space complexity= 0(1)
package com.dsa.questions;

import java.util.Arrays;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int nums[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
		
	}
	
	
    public static boolean containsDuplicate(int[] nums) {
        boolean ans=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans=true;
                break;
            }
            
        }
        
        return ans;
    }
}
