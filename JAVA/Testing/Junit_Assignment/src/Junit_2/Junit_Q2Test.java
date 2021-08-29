package Junit_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Junit_Q2Test {

	@Test
	void test1() {
		Junit_Q2 o = new Junit_Q2();
		int[] x = { 5, 4, 87, 54, 63, 41, 24, 84, 91 };

		assertEquals(new Find(4, 91), o.findMinMax(x));
	}

	@Test
	void test2() {
		Junit_Q2 o = new Junit_Q2();
		int[] x = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
		assertEquals(new Find(4, 4), o.findMinMax(x));
	}

	@Test
	void test3() {
		Junit_Q2 o = new Junit_Q2();
		int[] x = { -5, -4, -88, -41, -63, -91, -74, -84, -51 };
		assertEquals(new Find(-91, -4), o.findMinMax(x));
	}
}
