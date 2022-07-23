package RecursionQuestion;

public class FirstIndexOfNumber {
	public static int firstIndex(int input[], int x) {

		return checkIndex(input,x,0,-1);

	}
	private static int checkIndex(int input[], int x,int index,int ans){
		//base case
		if(index==input.length-1 || ans>-1){
			if(input[index]==x)
			{
				return index;
			}else 
			{
				return ans;
			}
		}
		//check
		if(input[index]==x){
			ans=index;
		}

		ans=checkIndex(input,x,index+1,ans);

		return ans;
	}

	public static void main(String[] args) {
		int input[]= {9, 8 ,10 ,8};
		int value=8;
		System.out.println(firstIndex(input, value));

	}

}
