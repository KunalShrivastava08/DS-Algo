package RecursionQuestion;

public class SubSetOfArray {

	public static int[] getSubset(int[] arr,int i) {
		if(arr.length==i)
		{
			int[] sarr= new int[1];
			return sarr;
		}
		
		int smallAns[]=getSubset(arr, i+1);
		
		int[] ans=new int[smallAns.length*2];
		int k=0;
		
		for(int value:smallAns) {
			ans[k]=value;
			k++;
		}
		int place=1;
		for(int p=1;p<arr.length-i;p++)
		{
			place*=10;
		}
		
		
		for(int value:smallAns) 
		{
			ans[k]=(arr[i]*place)+value;
			k++;
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int ans[]=getSubset(arr, 0);
		for (int i : ans) {
			System.out.println(i);
		}

	}

}
