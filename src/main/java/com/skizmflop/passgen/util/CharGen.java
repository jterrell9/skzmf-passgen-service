package com.skizmflop.passgen.util;

/**
 * Static methods for generating random characters.
 * @author John Terrell
 */
public class CharGen {
	
	/**
	 * Generates a random lowercase alphabetic character.
	 * @return char
	 */
	public static char lowerCaseAlphabetic() {
		return (char) ('a' + (int) Math.floor(Math.random() * 25));
	}
	
	/**
	 * Generates a random uppercase alphabetic character.
	 * @return char
	 */
	public static char upperCaseAlphabetic() {
		return (char) ('A' + (int) Math.floor(Math.random() * 25));
	}
	
	/**
	 * Generates a random digit between 0 and 9.
	 * @return char
	 */
	public static char digit() {
		return (char) ('0' + (int) Math.floor(Math.random() * 9));
	}
	
	
	
}
