package com.sirma.javacourse.designpatterns.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test all mathematical function.
 * 
 * @author mmakarieva
 */
public class CalculatorTest {
	/**
	 * Test gradation command.
	 */
	@Test
	public void gradationTest() {
		GradationCommand gr = new GradationCommand();
		Assert.assertEquals(16.0, gr.execute("4^2"), 0.1);
		Assert.assertEquals(256.0, gr.execute("16^2"), 0.1);
		Assert.assertEquals(100.0, gr.execute("-10^2"), 0.1);
	}

	/**
	 * Test addition command.
	 */
	@Test
	public void additionTest() {
		AdditionCommand add = new AdditionCommand();
		Assert.assertEquals(13.0, add.execute("8+5"), 0.1);
		Assert.assertEquals(20.0, add.execute("10+5+5"), 0.1);
		Assert.assertEquals(3.0, add.execute("8+-5"), 0.1);
		Assert.assertEquals(-3.0, add.execute("-8+5"), 0.1);
	}

	/**
	 * Test subtraction command.
	 */
	@Test
	public void subtractionTest() {
		SubtractionCommand subtraction = new SubtractionCommand();
		Assert.assertEquals(2.0, subtraction.execute("4-2"), 0.1);
		Assert.assertEquals(-8.0, subtraction.execute("4-2-10"), 0.1);
	}

	/**
	 * Test multiplication command.
	 */
	@Test
	public void muliplicationTest() {
		MultiplicationCommand multy = new MultiplicationCommand();
		Assert.assertEquals(8.0, multy.execute("4*2"), 0.1);
		Assert.assertEquals(80.0, multy.execute("4*2*10"), 0.1);
		Assert.assertEquals(-80.0, multy.execute("4*2*-10"), 0.1);
		Assert.assertEquals(-8.0, multy.execute("-4*2"), 0.1);
	}

	/**
	 * Test division command.
	 */
	@Test
	public void divisionTest() {
		DivisionCommand division = new DivisionCommand();
		Assert.assertEquals(2.0, division.execute("4/2"), 0.1);
		Assert.assertEquals(1.0, division.execute("4/2/2"), 0.1);
		Assert.assertEquals(-5.0, division.execute("-10/2"), 0.1);
		Assert.assertEquals(-5.0, division.execute("10/-2"), 0.1);
	}

}
