package Random;

import java.io.PrintWriter;

public class FinallyTest {

	public static int test1(int a, int b){
		try{
			return a/b;
		}
		catch(ArithmeticException ar){
			System.out.println("Catch prints");
			return 5;
		}
		finally{
			System.out.println("Finally prints");
		}
		
	}
	public static void main(String[] args) {
		PrintWriter pen = new PrintWriter(System.out,true);
		pen.println(test1(5 ,0));

	}

}
