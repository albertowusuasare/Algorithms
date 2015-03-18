package Chapter9;

import java.io.PrintWriter;

public class Question3 {
	
	public static int majicIndexAlt(int [] ar){
		return majicIndexAlt(ar,0,ar.length);
	}
	
	public static int majicIndexAlt(int [] ar, int start, int end){
		//preliminary checks
		if(start< 0 || end > ar.length || end < start)
		return -1;
		int mid = (start+end)/2;
		int midValue = ar[mid];
		if(midValue == mid)
			return mid;

		int left = majicIndexAlt(ar,start,midValue);
			if (left > -1)
			return left ;
	
	return majicIndexAlt(ar,midValue,end);
	}
	public static int magicIndex(int [] arr){
		return magicIndex(arr,0,arr.length -1);
	}//
	
	public static int magicIndex(int [] arr, int start , int end){
		//when can this problem go wrong
		if( start<0 || end <start || end >=arr.length)
			return -1;
		int middle = (end +start)/2;
		int val = arr[middle];
		if(val == middle)
			return middle;
		else if ( val < middle)
			return magicIndex(arr,middle+1,end);
		else
			return magicIndex(arr,start,middle -1);
	}//magicIndex(arr,start,end)

	public static void main(String[] args) {
		PrintWriter pen = new PrintWriter(System.out,true);
		int [] sample = {-2 ,-0, 2, 4, 6, 8, 10 }; 
		pen.println(magicIndex(sample));
		
		
		int [] sample2 = {-10,-5,2,2,2,3,4,7,9,12,13};
		pen.println(majicIndexAlt(sample2));
	}

}
