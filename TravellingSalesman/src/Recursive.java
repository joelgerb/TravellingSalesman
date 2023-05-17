import java.util.ArrayList;

public class Recursive {
	public void solve(ArrayList<Node> nodes) {
		double distance = 0;
		double bestDistance = Double.POSITIVE_INFINITY;
		System.out.println("I'm Solving using recursion!");
		
		
		for (int i = 0; i < nodes.size(); i++) {
			
			
			solve(nodes, nodes.get(i), distance, bestDistance);
			nodes.get(i).setVisited(true);
			
			if (distance < bestDistance) {
				bestDistance = distance;
			}
			distance = 0;

		
			//im trying to figure this out
//			distance += Utilities.distance(previousNode.getX, previousNode.getY, ode.getX, node.getY)
//			solve(nodes, distance);
		}
		for (int i = 0; i < nodes.size(); i++) {
			nodes.get(i).setVisited(false);
		}
		
	}
	
	public void solve(ArrayList<Node> nodes, Node lastNode, double distance, double bestDistance) {
		for (int i = 0; i < nodes.size(); i++) {
			
			if (nodes.get(i).getVisited() == false) {
				distance += Utilities.distance(lastNode, nodes.get(i));
				solve(nodes, nodes.get(i), distance, bestDistance);
				nodes.get(i).setVisited(true);
			}
			
			//im trying to figure this out
//			distance += Utilities.distance(previousNode.getX, previousNode.getY, ode.getX, node.getY)
//			solve(nodes, distance);
		}
		
	}
	
	
}
