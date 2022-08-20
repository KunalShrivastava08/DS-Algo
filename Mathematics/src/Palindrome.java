
public class Palindrome {

	public static int reverse(int num)
	{
		int temp=num;
		int ans=0;
		while(temp!=0) {
			int digit=temp%10;
			ans=ans*10+digit;
			temp=temp/10;
		}
		return ans;
	}
	
	public static boolean palindrom(int num)
	{
		int reverse=reverse(num);
		if(reverse==num) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(palindrom(131));

	}

}
