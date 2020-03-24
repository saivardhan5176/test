package epamTask.tddJunitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAChar {

	/*
	 * TODO list for my feature
	 * 1.case1:"ABCD" => "BCD"
	 * 2.case2:"AACD" => "CD"
	 * 3.case3:"BACD" => "BCD"
	 * 4.case4:"BBAA" => "BBAA"
	 * 5.case5:"AABAA" => "BAA"
	 * 6.case6:"" => ""
	 * 7.case7:"B" => "B"
	 */
	RemoveACharBeg removeAchar;
	
	@BeforeEach
	void function()
	{
		removeAchar=new RemoveACharBeg();
	}

	@Test
	void case1() {
		assertEquals("BCD",removeAchar.remove("ABCD"));
	}

	@Test
	void case2() {
		assertEquals("CD",removeAchar.remove("AACD"));
	}

	@Test
	void case3() {
		assertEquals("BCD",removeAchar.remove("BACD"));
	}
	
	@Test
	void case4() {
		assertEquals("BBAA",removeAchar.remove("BBAA"));
	}
	
	@Test
	void case5() {
		assertEquals("BAA",removeAchar.remove("AABAA"));
	}
	
	@Test
	void case6() {
		assertEquals("",removeAchar.remove(""));
	}

	
}
