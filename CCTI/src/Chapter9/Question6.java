package Chapter9;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Question6 {

	public static Set<String> generateParens(int n){
		Set<String> parenSet = new HashSet<String>();
		//base case:
		if ( n== 0)
			parenSet.add("");
		else {
		Set<String> remaining = generateParens(n-1);
		for (String str : remaining){
			int length = str.length();
			for (int i = 0; i < length ; i++){
				if ( str.charAt(i) == '('){
					String result =insertParen(str,i);
					parenSet.add(result);
				}
			}//for
			parenSet.add("()" + str);
		}//for
		}
		return parenSet;
	}//generateParens(int n)
	
	public static String insertParen(String str,int position){
		String results = str.substring(0, position +1);
		results +="()";
		results += str.substring(position+1);
		return results;
	}//insertParen
	public static void main(String[] args) {
	PrintWriter pen = new PrintWriter(System.out,true);
	pen.println(generateParens(4));

	}

}
