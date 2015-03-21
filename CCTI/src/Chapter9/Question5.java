package Chapter9;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Question5 {

	public static ArrayList<String> getPermuation(String str) {
		ArrayList<String> results = new ArrayList<String>();;
		if (str == null)
			return null;
		// Base case
		if (str.length() == 0) {
			
			results.add(""); // signal similar to the empty set
			return results;
		} else {
			char first = str.charAt(0);
			String remaining = str.substring(1);
			ArrayList<String> tempResults = getPermuation(remaining);
			
			// Iterate through the results from the subproblem and add
			// first to each position of each string
		
			for (String st : tempResults) {
				int length = st.length();
				for (int i = 0; i <= length; i++)
					results.add(insertCharAt(st, first, i));
			}
		}// else
		return results;
	}

	public static String insertCharAt(String str, char c, int index) {
		StringBuilder sb = new StringBuilder(str);
		sb.insert(index, c);
		return sb.toString();
	}

	public static void main(String[] args) {
		PrintWriter pen = new PrintWriter(System.out, true);
		// Testing insertCharAt
		String sample = "alb";
		//pen.println(insertCharAt(sample, 'a', 0));
		//pen.println(insertCharAt(sample, 'a', sample.length()));
		//Testing getPermutations
		pen.println(getPermuation(sample));
	}

}
