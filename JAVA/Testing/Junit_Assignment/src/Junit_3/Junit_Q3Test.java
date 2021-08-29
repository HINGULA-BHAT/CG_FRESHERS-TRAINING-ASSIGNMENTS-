package Junit_3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Junit_Q3Test {
	
		@Test
		void test() {
			Junit_Q3 ob= new Junit_Q3(17000);
			assertThrows(InsufficientFundsException.class, () -> ob.withdraw(20000));
		}

	
}
