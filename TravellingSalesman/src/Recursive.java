import java.util.ArrayList;

public class Recursive {
	public void solve(ArrayList<Node> nodes, double distance) {
		double bestDistance;
		System.out.println("I'm Solving using recursion!");
		
		for (Node node : nodes) {
			//im trying to figure this out
//			distance += Utilities.distance(previousNode.getX, previousNode.getY, ode.getX, node.getY)
			solve(nodes, distance);
		}
	}
}
