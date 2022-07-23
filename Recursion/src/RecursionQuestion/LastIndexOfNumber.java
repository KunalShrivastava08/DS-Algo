package RecursionQuestion;

import java.util.Scanner;

public class LastIndexOfNumber {

	public static int lastIndex(int input[], int x) {
		return checkIndex(input,x,input.length-1,-1);
	}


	private static int checkIndex(int[] input, int x, int index,int ans) {
		//Base case
        if(index==0 || ans>-1){
            if(input[index]==x)
            {
                return index;
            }
            else{
                return ans;
            }
        }
        
        //check
        if(input[index]==x){
            ans=index;
        }
        
        //recursion
        ans=checkIndex(input,x,index-1,ans);
        
        return ans;
        
    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int input[]= new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i]=sc.nextInt();
		}
		int value=sc.nextInt();
		System.out.println(lastIndex(input, value));

	}

}
