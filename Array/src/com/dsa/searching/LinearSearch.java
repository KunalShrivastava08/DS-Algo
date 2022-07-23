package com.dsa.searching;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {-4,-1,3,7,10,11};
		int key=7;
		int idx=linearSearch(arr,key);
		System.out.println(idx);

	}

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
