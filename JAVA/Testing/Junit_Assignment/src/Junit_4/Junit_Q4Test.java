package Junit_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Junit_Q4Test {
	
	Junit_Q4 b;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Startinggg....");
	}

	@AfterAll
	static void DownAfterClass() throws Exception {
		System.out.println("Down....");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initializing....");
		b= new Junit_Q4();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Cleaning project....");
		b=null;
	}

	@Test
	void test1() {
		assertEquals("HELLO", b.getCaps("Hello"));
	}
	
	@Test
	void test2() {
		assertEquals("TESTING", b.getCaps("testing"));
	}

}
