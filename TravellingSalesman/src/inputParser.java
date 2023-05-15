import java.util.Scanner;

public class inputParser {

	public void parseInput(String userInput) {
		
		if(userInput.equals("-q")) {
			System.out.println("Program Terminated");
			Main.run = false;
		}
		
		else if(userInput.equals("-h")) {
			System.out.println("-q: Quit the program");
		}
		
		else if(userInput.equals("-s")) {
			System.out.println("Select a solving method:");
			System.out.println("-a: Ant Colony Optimization");
			System.out.println("-r: Recursion");
			
			Scanner inputReader = new Scanner(System.in);
			System.out.print("->");
		    String input = inputReader.nextLine();
		    
		    if(userInput.equals("-a")) {
				AntColony antSolver = new AntColony();
				System.out.println("Solving with ants...");
				antSolver.solve();
			}
			
			else if(userInput.equals("-r")) {
				Recursive recursiveSolver = new Recursive();
				recursiveSolver.solve();
			}
		    
		}
		
		else {
			System.out.println("I don't understand");
		}
		
	}
	
}
