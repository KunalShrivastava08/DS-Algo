
public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
   
	public static int fact(int num) {
		int ans=1;
		
		for (int i = 1; i <= num; i++) {
			ans*=i;
		}
		
		
		return ans;

	}
}
