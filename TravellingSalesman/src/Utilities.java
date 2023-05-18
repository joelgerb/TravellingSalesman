import java.util.ArrayList;

public class Utilities {
	
	
	public static double distance(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY) {
		double base = pointOneX - pointTwoX;
		double height = pointOneY - pointTwoY;
		return pythagoras(base, height);
	}
	
	public static double distance(Node node1, Node node2) {
		return distance(node1.getXPosition(), node1.getYPosition(), node2.getXPosition(), node2.getYPosition());
	}
	
	public static double pythagoras(double base, double height) {
		return Math.hypot(base, height);
//		return Math.sqrt((height*height)+(base*base));
	}
	
	public static void printSolution(ArrayList<Node> solution, Double distance) {
		for(int i = 0; i < solution.size(); i++) {
			if(i == solution.size() - 1) {
				System.out.println(solution.get(i).getName());
			}
			
			else {
			System.out.print(solution.get(i).getName() + " -> ");
			}
		}
		System.out.println("Path length: " + distance );
	}
}
