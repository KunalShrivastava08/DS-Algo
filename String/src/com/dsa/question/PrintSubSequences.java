package com.dsa.question;

public class PrintSubSequences {

	public static void main(String[] args) {

		printSubsequences("xyz");
	}

	public static void printSubsequences(String input) {

		printSubsequences(input, "");
	}

	public static void printSubsequences(String input,String outputSoFar) {
		//Base case
		if(input.length()==0) {
			System.out.println(outputSoFar);
			return;
		}

		//We choose not to include the first character
		printSubsequences(input.substring(1), outputSoFar);

		//We choose to include the first character
		printSubsequences(input.substring(1), outputSoFar+input.charAt(0));


	}
}
