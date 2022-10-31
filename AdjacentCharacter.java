package Teleapps;

import java.util.*;

public class AdjacentCharacter {
	public static void main(String[] args) {
		String str = "abccbdabbc";
		Stack<Character> st = new Stack<>();
		st.push(str.charAt(0));

		for (int i = 1; i < str.length(); i++) {
			if (st.peek() == str.charAt(i)) {
				st.pop();
				continue;
			} else {
				st.push(str.charAt(i));
			}
		}
		StringBuilder obj = new StringBuilder();

		while (!st.isEmpty()) {
			obj.append(st.pop());
		}
		System.out.println(obj.reverse().toString());
	}
}
