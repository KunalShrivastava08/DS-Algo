package com.dsa.sorting;

import java.util.Scanner;

public class QuickSort {
	 public static void quickSort(int[] input,int si,int ei) {
	        //Base Case
	        if(si>=ei){
	            return;
	        }
	        
	        //Partition 
	        int piviotPosition=partition(input,si,ei);
	        
	        //Recursive call
	        quickSort(input,si,piviotPosition-1);
	        quickSort(input,piviotPosition+1,ei);
	    }
	    
	    
	    public static int partition(int[] input,int si,int ei) {
	    	//Find Piviot
	        int piviot=input[si];
	    
	    	//Place at position
	        int count=0;
	        for(int i=si;i<=ei;i++){
	            if(input[i]<piviot){
	                count++;
	            }
	        }
	        
	        //Swap
	        int piviotPos=si+count;
	      	input[si]=input[piviotPos];
	        input[piviotPos]=piviot;
	        
	    	
	        //Ensure towards left <=piviot and right >piviot
	        int i=si;
	        int j=ei;
	        while(i<piviotPos && j>piviotPos){
	            
	            if(input[i]<piviot){
	                i++;
	            }
	            if(input[j]>piviot)
	            {
	                j--;
	            }
	            if(input[i]>piviot && input[j]<piviot)
	            {
	                int temp=input[i];
	                input[i]=input[j];
	                input[j]=temp; 
	                i++;
	                j--;
	            }  
	           
	        }
	    	
	        //Return piviot position
	        return piviotPos;
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
