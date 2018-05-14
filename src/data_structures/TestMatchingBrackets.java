package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> bracketmatch = new Stack<Character>();
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (c == '{') {
				bracketmatch.push(b.charAt(i));

			} else {
				if (bracketmatch.isEmpty()) {
					return false;
				}
				bracketmatch.pop();

			}
			
		}
		if(bracketmatch.isEmpty()) {
			return true;
		}
		return false;
	}
}