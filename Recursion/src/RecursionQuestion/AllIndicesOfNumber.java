package RecursionQuestion;

import java.util.Scanner;

public class AllIndicesOfNumber {
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int array[]={};
        array=checkIndex(input,x,0,array);
        
		return array;
	}
	
    public static int[] checkIndex(int input[],int x,int startIndex,int array[]){
        
        //Base case
        if(startIndex==input.length-1)
        {
            
            if(input[startIndex]==x)
            {
                array=copyArray(array,startIndex);
                return array;
            }else{
               return array; 
            }
        }
        array=checkIndex(input,x,startIndex+1,array);
        
        //check
        if(input[startIndex]==x){
           array=copyArray(array,startIndex);
        }
        
        
        
        return array;
        
        
        
    }
    
    public static int[] copyArray(int array[],int index){
        int newArray[]=new int[array.length+1];
        for(int i=0;i<newArray.length;i++){
            if(i==0){
            	newArray[i]=index;
               
            }else{
            	 newArray[i]=array[i-1];
            }
        }
        return newArray;
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int input[]= new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i]=sc.nextInt();
		}
		int value=sc.nextInt();
		int ans[]=allIndexes(input, value);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		

	}

}
