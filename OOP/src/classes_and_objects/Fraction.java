package classes_and_objects;

public class Fraction 
{
	private int numerator;
	private int denominator;

	public Fraction(int numiretor, int denominator)
	{
		this.numerator = numiretor;
		if(denominator==0) 
		{
			return;
		}
		this.denominator = denominator;
		simplify();
	}

	public int getNumiretor() {
		return numerator;
	}

	public void setNumiretor(int numiretor) {
		this.numerator = numiretor;
		simplify();
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
		simplify();
	}

	public void print() 
	{
		if(denominator==1) {
			System.out.println(numerator);
		}else {
			System.out.println(numerator+"/"+denominator);
		}

	}

	private void simplify() {
		int gcf=1;
		int smaller=Math.min(numerator, denominator);
		for (int i = 2; i < smaller; i++) {
			if(numerator%i==0 && denominator%i==0)
			{
				gcf=i;
			}

		}
		numerator=numerator/gcf;
		denominator=denominator/gcf;
	}

	public static Fraction add(Fraction fraction1,Fraction fraction2) 
	{ 
		int newNum=(fraction1.numerator*fraction2.denominator)+(fraction2.numerator*fraction1.denominator);
		int newDen=fraction1.denominator*fraction2.denominator;
		return new Fraction(newNum,newDen); 

	}


	public void add(Fraction fraction) 
	{
		this.numerator=(this.numerator*fraction.denominator)+(fraction.numerator*this.denominator);
		this.denominator=this.denominator*fraction.denominator;
		simplify();
	}


}
