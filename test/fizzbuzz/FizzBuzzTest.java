package fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	
	
	
	@Test
	void testAvecUn() {
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}
	
	@Test
	void testAvecDeux() {
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}
	
	@Test
	void testAvecTrois() {
		assertEquals(FizzBuzz.fizzbuzz(3), "fizz");
	}
	@Test
	void testAvecQuatre() {
		assertEquals(FizzBuzz.fizzbuzz(4), "4");
	}
	
	@Test
	void testAvecCinq() {
		assertEquals(FizzBuzz.fizzbuzz(5), "buzz");
	}
	
	@Test
	void quelquesValeur() {
		assertEquals(FizzBuzz.fizzbuzz(850), "buzz");
		assertEquals(FizzBuzz.fizzbuzz(7), "7");
		assertEquals(FizzBuzz.fizzbuzz(96), "fizz");
		
	}
	
	
	
	
	
	
	
	

}
