
public class inputParser {

	public void parseInput(String userInput) {
		
		if(userInput.equals("-q")) {
			System.out.println("Program Terminated");
			Main.run = false;
		}
		
		else {
			System.out.println("I don't understand");
		}
		
	}
	
}
