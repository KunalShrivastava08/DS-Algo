/*
Given a string S, remove consecutive duplicates from it recursively.
I/P:aabccba
O/P:abcba
I/P:xxxyyyzwwzzz
O/P:xyzwz
*/
package com.dsa.question;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
	public static String removeConsecutiveDuplicates(String s) {
		String ans="";
		ans=remove(s,0,"");
		return ans;
	}

	public static String remove(String s,int index,String ans){
		if(s.length()-1==index){
			return s.charAt(index)+ans;
		}

		ans=remove(s,index+1,ans);

		if(s.charAt(index)!=ans.charAt(0)){
			ans=s.charAt(index)+ans;
		}


		return ans;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}
}
