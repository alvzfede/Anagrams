package com.test.anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.main.anagram.Solution;

public class SolutionTest {
	
	@Test
	public void doTest(){
		
		assertFalse(Solution.isAnagram("cara", "arc"));
		assertTrue(Solution.isAnagram("car", "rac"));	
		assertTrue(Solution.isAnagram("cat", "tac"));
		assertTrue(Solution.isAnagram("rat", "tar"));
		
	}

}
