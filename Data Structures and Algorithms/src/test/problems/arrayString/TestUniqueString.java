package test.problems.arrayString;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.problems.arrayString.UniqueString;

/**
 * Testing UniqueString class in main.problems.arrayString.UniqueString
 * @author Akshay Kumar
 *
 */
public class TestUniqueString {

	@Test
	public void validWithUnique() {
		UniqueString problem = new UniqueString();
		String testString = "test";
		assertEquals(problem.isUnique(testString), false);
	}
	
	@Test
	public void validWithNonUnique() {
		UniqueString problem = new UniqueString();
		String testString = "abcdef";
		assertEquals(problem.isUnique(testString), true);
	}
	
	@Test
	public void validSecondWayWithUnique() {
		UniqueString problem = new UniqueString();
		String testString = "test";
		assertEquals(problem.checkUnique(testString), false);
	}
	
	@Test
	public void validSecondWayWithNonUnique() {
		UniqueString problem = new UniqueString();
		String testString = "abcdef";
		assertEquals(problem.checkUnique(testString), true);
	}
	
	@Test
	public void validThirdWayWithUnique() {
		UniqueString problem = new UniqueString();
		String testString = "test";
		assertEquals(problem.checkUniqueWithBitwise(testString), false);
	}
	
	@Test
	public void validThirdWayWithNonUnique() {
		UniqueString problem = new UniqueString();
		String testString = "abcde";
		assertEquals(problem.checkUniqueWithBitwise(testString), true);
	}
	
}