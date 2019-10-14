/*
make a constant for the height
draw dashed line
	make a function:
		draw | sign
		draw height constant - 2 worth of "
		draw another | sign
draw top of hour glass
	for (lines 1 - 4)
		draw backslash
		draw (10 - 2*line) dots (:) on the output line
		draw slash
		go to new line
draw bottom of hour glass
	for (lines 1- 4)
		draw slash
		draw (2 + 2*line) dots (:) on the output line
		draw backslash
		go to new line
draw dashed line again

*/

public class Hourglass {
	public static final int HALF_HEIGHT = 4;
	
	public static void main(String[] args) {
		dashedLine();
		topHalf();
		verticalLines();
		System.out.println();					/*starts a new line after the vertical lines*/
		bottomHalf();
		dashedLine();
	}
	
	public static void dashedLine() {			 /*first line*/
		System.out.print("|");
		for (int i = 1; i <= (2+2*HALF_HEIGHT); i++) {
			System.out.print("\"");				 /*makes (2+2*the height of half) worth of dashes*/
		}
		System.out.println("|");
	}
	
	public static void topHalf() {					/*makes top half of the hour glass*/
		for (int lines = 0; lines < HALF_HEIGHT; lines++) {		/*prints the height of the top half*/
			for (int spaces = 0; spaces <= lines; spaces++) {			
				System.out.print(" ");				/*prints spaces before each line*/
			}
			System.out.print("\\");					/*starts the hour glass figure*/
			for (int colons = 0; colons < (2*HALF_HEIGHT-2*lines); colons++) {		
				System.out.print(":");				/*prints the number of colons for each line*/
			}
			System.out.println("/");				/*finishes the hour glass's other side*/
		}
	}
	
	public static void verticalLines() {			/*draws the vertical lines in the middle with spaces*/
		middleSpace();
		System.out.print(" ||");
		middleSpace();
	}
	
	public static void middleSpace() { 				/*makes the space before and after the two vertical lines in the center*/
		for (int x = 1; x <= HALF_HEIGHT; x++){
			System.out.print(" ");
		}
	}
	
	public static void bottomHalf() {				/*makes the bottom half of the hour glass*/
		for (int lines = 0; lines < HALF_HEIGHT; lines++) {
			for (int spaces = 0; spaces <= (HALF_HEIGHT-(lines+1)); spaces ++) {
				System.out.print(" ");				/*creates spaces the other way around*/
			}
			System.out.print("/");					/*left side of the hour glass*/
			for (int colons = 0; colons < (2+ 2*lines); colons++) {
				System.out.print(":");				/*prints the colons in the other way*/
			}
			System.out.println("\\");				/*right side of the hour glass*/
		}
	}
}
