package com.dsa.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {2,6,8,3,4,10,1};
		arr=insertionSort(arr,arr.length);
		for (int i : arr) {
			System.out.print(i+" ");	
		}

	}

	private static int[] insertionSort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int temp =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}


		return arr;
	}
}
