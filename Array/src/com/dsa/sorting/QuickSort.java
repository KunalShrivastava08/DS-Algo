package com.dsa.sorting;

import java.util.Scanner;

public class QuickSort {
	 public static void quickSort(int[] input,int si,int ei) {
	        //Base Case
	        if(si>=ei){
	            return;
	        }
	        
	        //Partition 
	        int piviotPosition=pivotIndex(input,si,ei);
	        
	        //Recursive call
	        quickSort(input,si,piviotPosition-1);
	        quickSort(input,piviotPosition+1,ei);
	    }
	    
	    
	 public static int pivotIndex(int arr[],int start,int end)
		{
	        //Find Piviot
			int pivot = arr[end];
	        
	         //Ensure towards left <=piviot and right >piviot
			int pIndex = start;
			int temp = 0;
			for(int i=start;i<end;i++)
			{
				if(arr[i]<=pivot)
				{
					temp = arr[i];
					arr[i] = arr[pIndex];
					arr[pIndex] = temp;
					pIndex++;
				}
			}
	        
	        //Place piviot at position 
			temp = arr[pIndex];
			arr[pIndex] = arr[end];
			arr[end] = temp;
	        
	        //Return piviot position
			return pIndex;
		}
	    
	    static Scanner s = new Scanner(System.in);
		
		public static int[] takeInput(){
			int size = s.nextInt();
			int[] input = new int[size];
			for(int i = 0; i < size; i++){
				input[i] = s.nextInt();
			}
			return input;
		}
		
		public static void main(String[] args) {
			int[] input = takeInput();
			quickSort(input,0,input.length-1);
			for(int i = 0; i < input.length; i++) {
				System.out.print(input[i] + " ");
			}
		}
}
