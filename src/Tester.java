
public class Tester {

	public static void main(String[] args) {

		int n = 50, d = 100;
		
		Fractions frac = new Fractions(n, d);
		
		System.out.println(frac.toString());
		System.out.println(frac.reduce());
		
	}

}
