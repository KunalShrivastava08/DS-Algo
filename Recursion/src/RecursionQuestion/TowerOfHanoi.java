/*
I/P:2
O/P:a b
    a c
    b c
 
I/P:3
O/P:a c
	a b
	c b
	a c
	b a
	b c
	a c
*/


package RecursionQuestion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void towerOfHanoi(int disk, char source, char auxiliary, char destination) {
		if(disk==1)
        {
            System.out.println(source+" "+destination);
            return;
        }
        if(disk==0)
        {
            System.out.println();
			return;
        }
        
        towerOfHanoi(disk-1,source,destination,auxiliary);
        System.out.println(source+" "+destination);
        towerOfHanoi(disk-1,auxiliary,source,destination);

	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}
}
