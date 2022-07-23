package com.dsa.sorting;

import java.util.Scanner;

public class MergeSort {
public static void mergeSort(int[] input){
		
		mergeSort(input,0,input.length-1);
	}
    
    public static void mergeSort(int[] input,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid+1,end);
        merge(input,start,end);
    }
    
    public static void merge(int[] input,int start,int end){
        int mid=(start+end)/2;
        int ans[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=end){
            if(input[i]<input[j]){
                ans[k]=input[i];
                i++;
            }else{
              ans[k]=input[j];  
                j++;
            }
            k++;
        }
        
        while(i<=mid){
            ans[k]=input[i];
            i++;
            k++;
        }
        
         while(j<=end){
            ans[k]=input[j];
            j++;
            k++;
        }
       
        
        for(int l=0;l<ans.length;l++){
            
            input[start+l]=ans[l];
           
        }
        
    }
    
    public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
}
