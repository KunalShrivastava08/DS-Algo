//Time complexity = O(n) , Space complexity= 0(1)
package com.dsa.questions;

import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter vaules for the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		int ans[]=reverseArray(arr);
		for (int i : ans) {
			System.out.print(i+" ");
		}

	}

	private static int[] reverseArray(int[] arr) {
		int length=arr.length-1;
		for (int i = 0; i <arr.length/2; i++) {
			int temp=arr[i];
			arr[i]=arr[length];
			arr[length]=temp;
			length--;	
		}
		return arr;
	}

}
