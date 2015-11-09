import java.util.ArrayList;

public class Fractions {

	private int numerator;
	private int denominator;
	private double ratio;
	
	
	Fractions(int numer, int denom){
		numerator = numer;
		denominator = denom;
		ratio = numerator / denominator;
	}

	private int gcd(){
		// two arrays lists for factors of numerator and denominator
		ArrayList <Integer> numArr = new ArrayList<Integer>();
		ArrayList <Integer> denomArr = new ArrayList<Integer>();
		int answer = 0, gcf = 0;
		
		// for loop to get all the factors of the numerator
		for (int i = 1; i <= numerator; i++)
		{
			answer = numerator / i;
			
			if (answer * i == numerator)
				numArr.add(i);
		}
		// for loop to get all the factors of the denominator 
		for (int i = 1; i <= denominator; i++)
		{
			answer = denominator / i;
			
			if (answer * i == denominator)
				denomArr.add(i);
		}
		
		// compares the factors to find the highest factor
		for (int i = 0; i < numArr.size(); i++)
		{
			for (int j = 0; j < denomArr.size(); j++)
			{
				if (numArr.get(i) == denomArr.get(j))
				{
					gcf = numArr.get(i);
					break;
				}		
			}	
		}
		return gcf;
		
		
	}
	
	public String reduce(){
		int newDenom = 0, newNumer = 0;
		int gcf = gcd();
		
		newDenom = denominator / gcf; 
		newNumer = numerator / gcf; 
		
		return newNumer + "/" + newDenom;
		
		
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
}
