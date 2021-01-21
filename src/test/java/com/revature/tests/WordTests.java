package com.revature.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.revature.app.WordProblems;
import com.revature.assessors.RevAssess;
import com.revature.assessors.RevaTest;

@ExtendWith(RevAssess.class)
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
		int length = WordProblems.findLength(chair);
		Assertions.assertEquals(5, length);
	}
	
	
	

}
