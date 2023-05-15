import java.util.Scanner;

public class Main {
	public static boolean run = true;
	static inputParser parser = new inputParser();
	
	public static void main(String args[]) {
		
		System.out.println("Use the command -q to quit the program");
		Scanner inputReader = new Scanner(System.in);
		
		while(run) {
			System.out.print("->");
		    String userInput = inputReader.nextLine();
		    
		    parser.parseInput(userInput);
		    
		}
		
		inputReader.close();
	}
}
