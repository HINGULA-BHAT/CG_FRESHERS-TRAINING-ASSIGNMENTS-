package Junit_1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Junit_Q1Test {

	@Test
	//Taking positive values
	void test1() {
		Junit_Q1 o= new Junit_Q1();
		int[] a= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		int[] expectedresult= {4,91};
		assertArrayEquals(expectedresult, o.findMinMax(a));
	}
	
	@Test
	// Taking same values
	void test2() {
		Junit_Q1 o= new Junit_Q1();
		int[] a= {4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
		int[] expectedresult= {4, 4};
		assertArrayEquals(expectedresult, o.findMinMax(a));
	}
	
	@Test
	// Taking Negative values
	void test3() {
		Junit_Q1 o= new Junit_Q1();
		int[] a= {-5, -4, -88, -41, -63, -91, -74, -84, -51};
		int[] expectedresult= {-91,-4};
		assertArrayEquals(expectedresult, o.findMinMax(a));
	}

}
