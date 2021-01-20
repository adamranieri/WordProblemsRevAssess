package com.revature.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revatuer.assessors.RevaTest;
import com.revature.app.WordProblems;

class WordTests {

	@RevaTest(points=10)
	void reverseWordLotus() {
		String lotus = "lotus";
		String reverse = WordProblems.reverseWord(lotus);
		Assertions.assertEquals("sutol", reverse);
	}
	
	@RevaTest(points=10)
	void reverseWordBlossom() {
		String blossom = "blossom";
		String reverse = WordProblems.reverseWord(blossom);
		Assertions.assertEquals("mossolb", reverse);
	}
	
	@RevaTest(points=5)
	void lengthWordChair() {
		String chair = "chair";
		String reverse = WordProblems.reverseWord(chair);
		Assertions.assertEquals("riahc", reverse);
	}
	
	
	

}
