package test.problems.arrayString;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
		assertFalse(problem.isUnique(testString));
	}
	
	@Test
	public void validWithNonUnique() {
		UniqueString problem = new UniqueString();
		String testString = "abcdef";
		assertTrue(problem.isUnique(testString));
	}
	
	@Test
	public void validSecondWayWithUnique() {
		UniqueString problem = new UniqueString();
		String testString = "test";
		assertFalse(problem.checkUnique(testString));
	}
	
	@Test
	public void validSecondWayWithNonUnique() {
		UniqueString problem = new UniqueString();
		String testString = "abcdef";
		assertTrue(problem.checkUnique(testString));
	}
	
	@Test
	public void validThirdWayWithUnique() {
		UniqueString problem = new UniqueString();
		String testString = "test";
		assertFalse(problem.checkUniqueWithBitwise(testString));
	}
	
	@Test
	public void validThirdWayWithNonUnique() {
		UniqueString problem = new UniqueString();
		String testString = "abcde";
		assertTrue(problem.checkUniqueWithBitwise(testString));
	}
	
}