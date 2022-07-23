//Time complexity = O(n log n) , Space complexity= 0(1)
package com.dsa.questions;

import java.util.Arrays;

public class ChocolateDistributionProblem 
{
	public static void main(String[] args) {
		int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 
				30, 40, 28, 42, 30, 44, 48, 
				43, 50};
                 
    int m = 7;  // Number of students
      
    int n = arr.length;// no. of chocolates 
    System.out.println("Minimum difference is "
            + findMinDiff(arr, n, m));
	}

	private static int findMinDiff(int[] arr, int n, int m) {
		if(n==0 || m==0) //If no chocolates in packets or no students
		{
			return 0;
		}
		
		if(n<m)// If more student then chocolates
		{
			return -1;
		}
		
		Arrays.sort(arr); //Sorting my array
		
		int min_diff = Integer.MAX_VALUE;//getting maximum value of int 
		
		
		for (int i = 0; i+m-1 < n; i++)//Taking subarray 
		{
			int diff=arr[i+m-1]-arr[i];
			if(diff<min_diff) 
			{
				min_diff=diff;
			}
		}
		
		
		
		return min_diff;
	}
}
