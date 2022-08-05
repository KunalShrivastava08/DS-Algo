package com.dsa.questions;


import java.util.Scanner;

public class MinimunNoOfJump {


	static int minJumps(int[] arr){
		if(arr.length==1) {
			return 0;
		}
		
		if(arr[0]==0) {
			return -1;
		}
		int range=arr[0];
		int stepLeft=arr[0];
		int jump=1;
		for (int i = 1; i < arr.length; i++) 
		{
			if(i==arr.length-1) {
				return jump;
			}
			range=Integer.max(range, i+arr[i]);
			stepLeft--;
			if(stepLeft==0) {
				jump++;
				if(range<=i) {
					return -1;
				}
				stepLeft=range-i;
			}
		}
		return -1;
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();


		int input[]= new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i]=sc.nextInt();
		}
		System.out.println(minJumps(input));
	}

}
