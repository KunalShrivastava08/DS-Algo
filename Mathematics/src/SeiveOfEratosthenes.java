//0 to 12 prime no. 2,3,5,7,11 
// This also use to print all the prime no. from 0 to n
import java.util.Arrays;

public class SeiveOfEratosthenes {

	public static void main(String[] args) {
	  boolean ans[]=seiveOfEratosthenes(12);
	  for (boolean b : ans) {
		System.out.print(b+ " ");
	  }
	  System.out.println();
	  for (int i = 0; i < ans.length; i++) {
		if(ans[i]==true) {
			System.out.print(i+" ");
		}
	 }
	}
	
	public static boolean[] seiveOfEratosthenes(int n) {
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0]=false;
		isPrime[1]=false;
		
		for (int i = 2; i*i <= n; i++) {
			for (int j = i*2; j <= n; j+=i) {
				isPrime[j]=false;
			}
		}
		
		return isPrime;
		
	}
}
