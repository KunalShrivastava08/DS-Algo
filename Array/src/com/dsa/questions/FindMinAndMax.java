//Time complexity = O(n) , Space complexity= 0(1)
package com.dsa.questions;

import java.util.Scanner;

public class FindMinAndMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter vaules for the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		int ans[]=findMinMax(arr);
		System.out.println("Min value in array = "+ans[0]);
		System.out.println("Max value in array = "+ans[1]);
	}

	private static int[] findMinMax(int[] arr) {
		int ans[]=new int[2];
		
		if(arr.length>0) {
			ans[0]=arr[0];
			ans[1]=arr[0];
		}else {
			ans[0]=0;
			ans[1]=0;
		}

		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<ans[0]) {
				ans[0]=arr[i];
			}else if(arr[i]>ans[1]){
				ans[1]=arr[i];
			}
		}

		return ans;
	}

}
