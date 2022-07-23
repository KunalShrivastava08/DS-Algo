package com.dsa.searching;
//Binary Search use when we get sorted array
public class BinarySearch 
{
	public static void main(String[] args) {
		int arr[]= {-4,-1,3,7,10,11};
		int key=7;
		int idx=binarySearch(arr,key);
		System.out.println(idx);

	}

	public static int binarySearch(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;

		while (low<=high) 
		{
			int mid=(low+high)/2;

			if(arr[mid]==key) {
				return mid;
			}else if(key>arr[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}

		return -1;
	}
}
