package com.dsa.questions;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {1 ,3, 6 ,11 ,12, 17, 22, 26, 30, 33, 38 };
		int d=7;
		rotate(arr, d);
        for (int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void rotate(int[] arr, int d) {
		 int newarr[] = new int[arr.length];
	        int k=0;
	        int j=d;
	        //Copying element from d to end
	        while(j<arr.length)
	        {
	            newarr[k]=arr[j];
	            j++;
	            k++;
	        }
	       
	        j=0;
	        //Copying element from 0 to d-1
	        while(j<d){
	           newarr[k]=arr[j];
	           j++;
	           k++;
	        }
	       for (int i = 0; i < newarr.length; i++) {
			arr[i]=newarr[i];
		}
    }

}
