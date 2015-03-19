package Chapter9;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Question4 {
 
	public static <T> ArrayList<ArrayList<T>> getSubsets( ArrayList<T> set , int index){
		ArrayList<ArrayList<T>> results;
		if(set.size() == index){
			results = new ArrayList<ArrayList<T>>();
			results.add( new ArrayList<T>());
			return results;
		}
		
		else {
			T first = set.get(index);
			//System.out.println("results " + results);
			System.out.println(set);
			results = (getSubsets(set, index +1));
			ArrayList<ArrayList<T>> tempBuffer = new ArrayList<ArrayList<T>>();
			for(ArrayList<T> subset : results){
				ArrayList<T> temp = new ArrayList<T>();
				temp.add(first);
				temp.addAll(subset);
				tempBuffer.add(temp);
			}//for
			results.addAll(tempBuffer);
		}//else
		return results;
	}
	
	public static void main(String [] args){
		PrintWriter pen = new PrintWriter(System.out,true);
		ArrayList<Integer> set =  new ArrayList<Integer>();
		for (int i =1 ; i< 4; i++)
			set.add(i);
		pen.println("Initial set " + set.toString());
		pen.println(getSubsets(set,0));
	}//main
}
