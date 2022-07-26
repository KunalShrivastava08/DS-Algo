package com.dsa.question;

public class PrintKeypadCombinationsCode {
	public static void printKeypad(int input)
	{
		printKeypad(input,"");

	}
	public static void printKeypad(int input,String outputSoFar){
		if(input==0){
			System.out.println(outputSoFar);
			return;
		}
		String smallAns[]=helper(input%10);

		for(int i=0;i<smallAns.length;i++)
		{
			printKeypad(input/10,smallAns[i]+outputSoFar);      
		}


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
		printKeypad(23);
	}

}
