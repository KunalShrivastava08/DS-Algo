/*Given an input string S and two characters c1 and c2, 
 * you need to replace every occurrence of character c1 with character c2 in the given string.
 * Line 1 : Input String S
 * Line 2 : Character c1 and c2 (separated by space)
 * I/P:abacd
       a x
 * O/P:xbxcd
 * */
package com.dsa.question;

import java.util.Scanner;

public class ReplaceCharacterRecursively 
{
	public static String replaceCharacter(String input, char c1, char c2) {

		if(input.length()==0){
			return input;   
		}
		String ans="";

		if(input.charAt(0)==c1){

			ans+=c2; 
		}else{
			ans=ans+input.charAt(0);
		}

		String smallAns=replaceCharacter(input.substring(1),c1,c2);

		return ans+smallAns;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));
	}
}
