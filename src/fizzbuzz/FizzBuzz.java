package fizzbuzz;

public class FizzBuzz {
	
	static String[] nom = {"fizz","buzz"};
	static int[] valSpecial = {3,5};
	
	
	
	public static String fizzbuzz(int entree) {
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i<valSpecial.length; i++) {
			if(entree % valSpecial[i] == 0) {
				res.append(nom[i]);	
			}
		}
		
		if(res.length() == 0)
			return Integer.toString(entree);
		else
			return res.toString();

	}

}
