package RecursionQuestion;

public class Sum {
	public static int sum(int input[]) {
        if(input.length<=1)
        {
            return input[0];
        }
		
        int smallArr[]=new int[input.length-1];
        for(int i=1;i<input.length;i++)
        {
            
            smallArr[i-1]=input[i];
        }
       
        int sum= sum(smallArr);
            sum=sum+input[0];  
        
        return sum;
	}
	
	public static void main(String[] args) {
		int input[]= {9, 8 ,9};
		System.out.println(sum(input));
	}
}
