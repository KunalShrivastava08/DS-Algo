package classes_and_objects;

public class FractionUse 
{
	public static void main(String[] args) {
		Fraction f1=new Fraction(2, 3);
		//f1.print();
		
		Fraction f2=new Fraction(5, 6);
		//f1.add(f2);
		//f1.print();
		
		Fraction f3=Fraction.add(f1, f2);
		f3.print();
		
		
	}
	
	
}
