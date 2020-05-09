package main.problems.arrayString;

import java.util.HashSet;

/**
 * Problem Statment:
 * Implement an algorithm to determine if a string has all unique character. What if you cannot use additional data structures?
 * 
 * @author Akshay Kumar
 *
 */
public class UniqueString {
	
	/**
	 * Checks whether the string contains unique characters or not
	 * Uses HashSet to check if the characters are unique.
	 * @param str - to be checked for unique characters
	 * @return true - if the string contains unique characters
	 */
	public boolean isUnique(String str) {
		HashSet<Character> set = new HashSet<>();
		char[] list = str.toCharArray();
		for (char ch : list) {
			if(set.add(ch) == false)
				return false;
		}
		return true;
	}
	
	/**
	 * Checks whether the string contains unique characters or not
	 * Without using additional data structures
	 * @param str - to be checked for unique characters
	 * @return true - if the string contains unique characters
	 */
	public boolean checkUnique(String str) {
		char[] characters = str.toCharArray();
		for (int i=0; i<characters.length; i++) {
			for (int j=0; j<characters.length; j++) {
				if (i != j && characters[i] == characters[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Checks whether the string contains unique characters or not
	 * Without using additional data structures
	 * Using Bitwise vector
	 * @param str - to be checked for unique characters
	 * @return true - if the string contains unique characters
	 */
	public boolean checkUniqueWithBitwise(String str) {
		int checker = 0;
		int val = 0;
		for (int i=0; i< str.length(); i++) {
			val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}

}
