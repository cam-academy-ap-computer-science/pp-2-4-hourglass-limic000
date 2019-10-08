/*
draw dashed line
	make a function:
		draw | sign
		draw 10 " s
		draw another | sign
draw top of hour glass
	for (lines 1 - 4)
		draw backslash
		draw (10 - 2*line) dots (:) on the output line
		draw slash
		go to new line
draw bottom of hourglass
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
	}
	
	public static void dashedLine() {
		System.out.println("|");
		for (int i = 1; i <= (2+2*HALF_HEIGHT); i++) {
			System.out.println("\"");
		}
		System.out.println("|");
	}


}
