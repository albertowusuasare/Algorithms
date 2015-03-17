package Chapter9;

import java.io.PrintWriter;

public class Question1 {

	/**
	 * A child is running up a staircase with n steps, and can hop either 1 step, 2
	 * steps or 3 steps at a time. Implement a method to count how many possible
	 * ways the child can run up the stairs.
	 * 
	 */
	
	/*
	 * Idea : let us imagine that the child is on the very last hop, the nth step
	 *	    . We know that to get to the last step the the child could have taken a single 
	 *	      step, or 2 steps or 3 steps.
	 *        Therefore for the number of ways to get to the n step is the total number of ways 
	 *        to get to the n-1, n-2 , n-3
	 * 
	 */
	
	public static int countWays(Integer n){
		int [] cache = new int [n+1];
		return countWays(n,cache);
	}
	public static Integer countWays(Integer n, int [] cache){
		//No such thing as negative step: return 0
		if (n <0 )
			return 0;
		//Since we are using a top down model. when ever we subtract and get to the base, we have
		//found a way so we add 1
		if( n ==0)
			return 1;
		if(cache[n] > 0)
			return cache[n];
		else {
		// else results is the combination of the numberof
		cache[n] =countWays(n -1,cache) + countWays(n -2, cache) + countWays(n -3,cache);
		return cache[n];
		}
	}
	public static void main(String[] args) {
		PrintWriter pen = new PrintWriter(System.out,true);
		Integer results = countWays(3);
		pen.println(results);

	}

}
