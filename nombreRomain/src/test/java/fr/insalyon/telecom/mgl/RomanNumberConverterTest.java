package fr.insalyon.telecom.mgl.RomanNumber;

//import fr.insalyon.telecom.mgl.RomanNumber.RomanNumberConverter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RomanNumberConverterTest{


	@Test
	public void convert_literals_to_integers() {

		RomanNumberConverter r = new RomanNumberConverter();

		assertThat(r.romanToInt("I"), is(1));
		assertThat(r.romanToInt("V"), is(5));
		assertThat(r.romanToInt("X"), is(10));
		assertThat(r.romanToInt("L"), is(50));
		assertThat(r.romanToInt("C"), is(100));
		assertThat(r.romanToInt("D"), is(500));
		assertThat(r.romanToInt("M"), is(1000));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNegativeNumberValue(){
	RomanNumberConverter r = new RomanNumberConverter();

	r.intToRoman(0);

	}

	@Test(expected=IllegalArgumentException.class)
	public void testWrongLetter(){
	RomanNumberConverter r = new RomanNumberConverter();
	r.romanToInt("Z");
	}

	@Test(expected=IllegalArgumentException.class)
	public void testFourLetterInARow(){
	RomanNumberConverter r = new RomanNumberConverter();
	r.romanToInt("IIII");
	}
}