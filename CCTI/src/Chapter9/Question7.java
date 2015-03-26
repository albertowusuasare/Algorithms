package Chapter9;
/**
 * 
 * @author albertowusu-asare
 * Date : Wed Mar 25 23:53:47 CDT 2015
 *
 */
public class Question7 {
	//Add whatever colors you like to his enum structure
	enum Colors {
		RED,ORANGE, YELLOW, BLUE,BLACK
	}
	
	public static boolean paintFill(Colors [][] canvas, int x, int y, Colors nColor ){
		if( canvas[y][x] == nColor)
			return false;
		return paintFill(canvas,x,y,nColor,canvas[y][x]);
	}
	
	public static boolean paintFill(Colors [][]canvas,int x, int y, Colors nColor, Colors oColor){
		//bounds check
		if( x < 0 ||x<= canvas[0].length || y<0 ||y <= canvas.length)
			return false;
		if(canvas[y][x] == oColor){
			canvas[y][x] = nColor;
			//change upper pixel
			paintFill(canvas, x,y-1,nColor,oColor);
			//change lower pixel
			paintFill(canvas, x,y+1,nColor,oColor);
			//change left pixel
			paintFill(canvas, x-1,y,nColor,oColor);
			//change right pixel
			paintFill(canvas, x+1,y,nColor,oColor);
		}
		return true;
	}
	

}
