package fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



public class FizzBuzzTest {
	
	@Test
	void fizz_un() {
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}
	
	@Test
	void fizz_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2),"2");
	}
	
	
	@Test
	void fizz_trois() {
		assertEquals(FizzBuzz.fizzbuzz(3), "fizz");
	}

}
