package com.dsa.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {2,6,8,3,4,10,1};
		arr=selectionSort(arr,arr.length);
		for (int i : arr) {
			System.out.print(i+" ");	
		}

	}

	private static int[] selectionSort(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}

			if(i!=min) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}


		return arr;
	}
}
