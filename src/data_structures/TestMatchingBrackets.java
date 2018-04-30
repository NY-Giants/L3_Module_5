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
			bracketmatch.push(b.charAt(i));
		}
		int openCount = 0;
		int closeCount = 0;
		int size = bracketmatch.size();
		System.out.println(size);
		for (int j = 0; j < size; j++) {
			Character poppedcharacters = bracketmatch.pop();
			if (poppedcharacters.equals('{')) {
				openCount++;
				System.out.println("open"+openCount);
			}

			else if (poppedcharacters.equals('}')) {
				closeCount++;
				System.out.println("close"+closeCount);
			}
		}
		if (openCount == closeCount) {
			System.out.println("true");
			return true;

		} else {
			System.out.println("false");
			return false;
		}

	}

}