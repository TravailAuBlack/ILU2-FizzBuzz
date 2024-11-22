package fizzbuzz;

public class FizzBuzz {
	static int[] divisible = {3,5};
	static String[] mots = {"fizz", "buzz"};
	
	
	public static String fizzbuzz(int entree) {
		StringBuilder res = new StringBuilder();
		
		for(int i=0; i<divisible.length; i++) {
			if(entree % divisible[i] == 0)
				res.append(mots[i]);
					
		}
		
		if(res.length() == 0)
			return Integer.toString(entree);
		else 
			return res.toString();
		
	}
	
	
	
	

}
