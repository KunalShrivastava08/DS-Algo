package RecursionQuestion;

public class Factorial {

	public static int fact(int n)
	{
		if(n==1) {
			return 1;
		}

		int smallAns=fact(n-1);

		return n*smallAns;	
	}
	public static void main(String[] args) {
		int n=3;
		System.out.println(fact(n));

	}

}
