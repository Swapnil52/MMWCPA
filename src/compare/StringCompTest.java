package compare;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


import org.junit.Before;
import org.junit.Test;



public class StringCompTest {
	
	private StringComp classUnderTest;
	
	@Before
	public void setup() {
		classUnderTest = new StringComp();
	}
	
	@Test
	public void testStringComparisonWithShortString() {
		String left = "abc";
		String right = "def";
		double expected = 0.0000;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	
	@Test
	public void testStringComparisonWithEqualtring() {
		String left = "abcdef";
		String right = "abcdef";
		double expected = 1.0000;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	
	@Test
	public void testStringComparisonWithLongStrings() {
		String left = "Austria";
		String right = "Australia";
		double expected = 0.6731;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	@Test
	public void testStringComparisonWithUppperCaseStrings() {
		String left = "Python";
		String right = "python";
		double expected = 0.83333;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	@Test
	public void testStringComparisonWithMixedStrings() {
		String left = "a123b";
		String right = "ab123";
		double expected = 0.6982;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	@Test
	public void testStringComparisonWithAddressStrings() {
		String left = "129 Industry Park";
		String right = "129 Indisttry Park";
		double expected = 0.6101;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	@Test
	public void testStringComparisonWithTestStrings() {
		String left = "abc de";
		String right = "abc k de";
		double expected = 0.6388;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	@Test
	public void testStringComparisonWithTestStrings2() {
		String left = "abc de";
		String right = "abc de";
		double expected = 1.0000;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	@Test
	public void testStringComparisonWithTestStrings3() {
		String left = "Fu Hui";
		String right = "Mr Fu Hui";
		double expected = 0.8000;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}
	@Test
	public void testStringComparisonWithTestStrings4() {
		String left = "Fu Hui";
		String right = "Fu Mr Hui";
		double expected = 0.5962;
		double result = classUnderTest.compare(left, right);
		assertThat(result, is(expected));
	}

}
