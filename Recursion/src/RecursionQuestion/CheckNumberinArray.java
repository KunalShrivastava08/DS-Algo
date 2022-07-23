package RecursionQuestion;

public class CheckNumberinArray {

	public static boolean checkNumber(int input[], int x) {
		
		
		 //Base case
        if(input.length<=1){
            if(input[0]==x){
                return true;
            }else {
                return false;
            }
        }
        
        // create small array to check
        int smallInput[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            
            smallInput[i-1]=input[i];
        }
        
        //recursion
        boolean smallAns=checkNumber(smallInput,x);
        //work/checking no. is present or not
        if(smallAns){
            
            return true;
        }else{
            if(input[0]==x){
                return true;
            }else{
                return false;
            }
            
        }
    
		
	
	}
	public static void main(String[] args) {
		int input[]= {9,8,10};
		int x=7;
		System.out.println(checkNumber(input, x));

	}

}
