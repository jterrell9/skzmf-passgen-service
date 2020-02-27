package com.skizmflop.passgen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skizmflop.passgen.util.CharGen;

/**
 * Service to generate a random string of a given length
 * @author John Terrell
 */
@Service
public class RandomStringService {

	private StringBuilder rand_strb;
	private Integer size;
	
	/**
	 * Constructor with size.
	 * @param size
	 */
	@Autowired public RandomStringService(Integer size) {
		this.rand_strb = new StringBuilder();
		this.size = size;
	}
	
	/**
	 * Static factory method.
	 * @param size
	 * @return instance of RandomStringService
	 */
	public static RandomStringService instance(Integer size) {
		return new RandomStringService(size);
	}
	
	/**
	 * Returns the finalized random String.
	 * @return String
	 */
	public String generate() {
		for(int i=0; i<this.size; i++) {
			rand_strb.append(CharGen.upperCaseAlphabetic());
		}
		return this.rand_strb.toString();
	}
	
	
}
