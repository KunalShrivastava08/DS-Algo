/*Return Keypad Code
Send Feedback
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
I/O:23
O/P:ad
ae
af
bd
be
bf
cd
ce
cf*/
package com.dsa.question;

import java.util.Scanner;

public class ReturnKeypadCode {
	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		//Base Case
		if(n==0){
			String ans[]={""};
			return ans;
		}


		String smallAns[]=keypad(n/10);
		int num=n%10;
		String helpString[]=helper(num);
		String ans[]=new String[smallAns.length*helpString.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++){
			int m=0;
			while(m<helpString.length){
				ans[k]=smallAns[i]+helpString[m];
				m++;
				k++;    
			}
		}

		return ans;



	}
	public static String[] helper(int n){

		if(n==0) {
			String ans[]={""};
			return ans;
		}else  if(n==1) {
			String ans[]={""};
			return ans;
		}else  if(n==2) {
			String ans[]={"a","b","c"};
			return ans;
		}else  if(n==3) {
			String ans[]={"d","e","f"};
			return ans;
		}else  if(n==4) {
			String ans[]={"g","h","i"};
			return ans;
		}else  if(n==5) {
			String ans[]={"j","k","l"};
			return ans;
		}else  if(n==6) {
			String ans[]= {"m","n","o"};
			return ans;
		}else  if(n==7) {
			String ans[]={"p","q","r","s"};
			return ans;
		}else  if(n==8) {
			String ans[]={"t","u","v"};
			return ans;
		}else  if(n==9) {
			String ans[]={"w","x","y","z"};
			return ans;
		}else {
			String ans[]={""};
			return ans;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
