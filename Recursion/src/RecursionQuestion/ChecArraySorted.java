package RecursionQuestion;

public class ChecArraySorted {
	public static boolean checkArraySorted(int input[],int startIndex) {
		//Base case
		if(startIndex==input.length-1) {
			return true;
		}

		//checking
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}

		//recursion
		boolean smallAns=checkArraySorted(input, startIndex+1);

		return smallAns;
	}

	public static void main(String[] args) {
		int input[]= {1,2,3,4};
		System.out.println(checkArraySorted(input, 0));
	}
}
