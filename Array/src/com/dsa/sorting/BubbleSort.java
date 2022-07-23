package com.dsa.sorting;

public class BubbleSort
{
	public static void main(String[] args) {
		int arr[]= {2,6,8,3,4,10,1};
		arr=bubbleSort(arr,arr.length);
		for (int i : arr) {
		System.out.print(i+" ");	
		}
		
	}

	private static int[] bubbleSort(int[] arr, int length) {
		for (int i = 0; i < length-1; i++) {
			boolean swap=false;
			for (int j = 0; j < length-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
					swap=true;
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			if(!swap) {
				break;
			}
		}
		return arr;
	}
}
