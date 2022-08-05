// IP - radar, OP - true
// IP - apple, OP - false

package RecursionQuestion;

public class Palindrom {

	public static void main(String[] args) {
		String str="radar";
		System.out.println(checkPalindrom(str, 0, str.length()-1, false));

	}
	
	public static boolean checkPalindrom(String str,int i,int j,boolean ans) {
		if(i==j) {
			return true;
		}
		
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		
		ans=checkPalindrom(str, i+1, j-1,ans);

		return ans;
		
	}

}
