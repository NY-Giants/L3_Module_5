package data_structures;

import java.util.Stack;

public class FunStuff {

	public static void main(String[] args) {
		String Firststring = "}{{}}{";
		
		Stack<Character> brackets = new Stack<Character>();
		
		for(int i = 0; i < Firststring.length(); i++) {
			if(Firststring.charAt(i) == '{' ) {
				brackets.push(Firststring.charAt(i));
			}
			else if (Firststring.charAt(i) == '}' ){
				if(brackets.isEmpty()) {
					System.out.println("true");
			}
			}
		}
		System.out.println(brackets);
	}

}
