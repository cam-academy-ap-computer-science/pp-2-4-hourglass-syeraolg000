/*First drawing one line with 10 quotes and a line at the end
 * Then I'll print a space and a backslash with 8 colen's ending with a slash

*/

public class Hourglass {
	public static void main(String[] args) { 
		line();
		topbody();
	}
	
	public static void line() {
		System.out.print("|");
		for (int i = 1; i<=10; i++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println();
	}
		

	public static void topbody() {
		for (int i = 1; i<=4; i++) {
			for (int j = 1; j<=0 + i; j++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j = 1; j<=4; j++) {
				 int collen = (-2 * j) + 10 
					 
				 }
				System.out.print(":");
			}
			System.out.println("/");
			System.out.println();
		}
	}




