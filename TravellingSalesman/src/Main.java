import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static boolean run = true;
	static InputParser parser = new InputParser();
	
	public static ArrayList <Node> nodes = new ArrayList<Node>();
	
	public static void main(String args[]) {
		
		//Hard coded nodes for testing
		nodes.add(new Node("a", 0.0, 0.0));
		nodes.add(new Node("b", 1.0, 0.0));
		nodes.add(new Node("c", 1.0, 1.0));
		nodes.add(new Node("d", 1.5, 0.0));
		
		
		
		System.out.println("Use the command -h if you need help");
		Scanner inputReader = new Scanner(System.in);
		
		while(run) {
			System.out.print("->");
		    String userInput = inputReader.nextLine();
		    
		    parser.parseInput(userInput);
		    
		}
		
		inputReader.close();
	}
}
