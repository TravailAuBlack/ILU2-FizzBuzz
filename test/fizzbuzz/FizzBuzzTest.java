package fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	
	
	
	@Test
	void testAvecUn() {
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}

}
